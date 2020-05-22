package methodreferences;

import interfacefeatures.Employee;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FuncImpl {

    interface  ThreadSupplier
    {
        Thread giveMeAThread();
    }
    public static void main(String[] args) {
        //static method
        Supplier<Thread> s1= Thread::currentThread;

        ThreadSupplier ts=  Thread::currentThread;


        //Reference to Instance method

        Employee frank=new Employee("Frank",3000);
        Integer i= frank.getSalary();
        Supplier<Integer>s2=frank::getSalary;
        System.out.println(s2.get());

        //Instance method specified
        Consumer<String> c1=System.out::println;

        //Instance not specified
        Function<Employee,Integer> f1= Employee::getSalary;
        Integer frankSalary=f1.apply(frank);
        System.out.println("Frank Salary "+frankSalary);

        Comparator<Employee> byName=
                Comparator.comparing(Employee::getName);

            Employee dept[]=new Employee[5];
            dept[0]=new Employee("Joe",10000000);
            dept[1]=new Employee("Eddie",1000000);
            dept[2]=new Employee("Brendan",100000);
            dept[3]=new Employee("Bryan",100000);
        dept[4]=new Employee("Jamie",10000);
        printAll(dept,Employee::getName);

        //cand do the same for salary as the types are different

        printAll(dept, employee -> "" + employee.getSalary());

    }

    public static <T> void printAll(T[] array, Function<T,String> toStringFun)
    {
        int i=0;
        for(T t:array)
        {
            System.out.println(i++ +"   "+toStringFun.apply(t));
        }
    }
}
