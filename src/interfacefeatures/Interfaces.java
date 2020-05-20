package interfacefeatures;

import java.util.Comparator;

public class Interfaces {

    public static void main(String[] args) {
        Employee mike=new Employee("Mike", 2000),
                louise=new Employee("Louise", 2500);

        Comparator<Employee> byName=new Comparator<Employee>() {// Anonymous class here
            @Override
            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }
        };

        System.out.println("By Name");
        System.out.println(byName.compare(mike, louise));

        try
        {
            System.out.println(byName.compare(mike, null));
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }

        //To accept null as a value and not throw an exception

        Comparator<Employee> byNameThenNull=Comparator.nullsLast(byName);

        System.out.println("Then null:");
        System.out.println(byNameThenNull.compare(mike,louise));
        System.out.println(byNameThenNull.compare(mike,null));//null values after all regular values

        //to reverse the order of comparator

        Comparator<Employee> byDecreasingName=Comparator.nullsLast(byName);

        System.out.println("Then null:");
        System.out.println(byDecreasingName.compare(mike,louise));
        System.out.println(byDecreasingName.compare(mike,null));

    }
}
