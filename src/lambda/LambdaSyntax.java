package lambda;

import interfacefeatures.Employee;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaSyntax {

    public static void main(String[] args) {
        Comparator<Employee> byName=new Comparator<>()//Using Anonymous class
        {
            public int compare(Employee a , Employee b)
            {
             return a.getName().compareTo(b.getName());
            }
        };
        //Functional interfaces have a single abstract method and has only one method compare
        //Using parameters with object types and return
        Comparator<Employee> byNameLambda1 =
                (Employee a, Employee b)->{return a.getName().compareTo(b.getName());};

        //Without parameter type as we are assigning expression to a comparator of Employee, compiler figures it out because lambda is assigned to employee class

        Comparator<Employee> byNameLambda2=
                (a,b)->{ return a.getName().compareTo(b.getName());};

        // Removing braces and return

        Comparator<Employee> byNameLambda3=
                (a,b)-> a.getName().compareTo(b.getName());

        //No Parameters

        Runnable r=()->{
            System.out.println("A compact Runnable");
        };
        Thread t1=new Thread(r);

        //Can be created without Runnable

        Thread t2= new Thread(()->{ System.out.println("An Implicit Runnable");});

        //As its a single statement
        Thread t3= new Thread(()->System.out.println("An Implicit Runnable"));

        //One Parameter
        Consumer<String> lenghtPrinter = s-> System.out.println(s.length());





    }
}
