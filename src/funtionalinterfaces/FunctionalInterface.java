package funtionalinterfaces;

import java.time.LocalTime;
import java.util.Objects;

public class FunctionalInterface {

    public static void main(String[] args) {
        System.out.println(composeHashCode("Hello", "World"));
        System.out.println(composeHashCode("Hello", null));

    }

  /*  public static int composeHashCode(Object a, Object b)
    {
        return  a.hashCode()^b.hashCode();
    }*/

    public static String getApplicationStatus()
    {
        System.out.println("getApplicationStatus");
        return "It's "+ LocalTime.now();
    }

    //Here the funtion getApplicationStatus is called 4 times even if its null
 /* public static int composeHashCode(Object a, Object b)
  {//identify which argument is null
      Objects.requireNonNull(a,"a may not be null " + getApplicationStatus());
      Objects.requireNonNull(b,"a may not be null " + getApplicationStatus());
      return  a.hashCode()^b.hashCode();
  }
  */
    public static int composeHashCode(Object a, Object b)
    {
        Objects.requireNonNull(a,()->"a may not be null " + getApplicationStatus());//supplier of string here only invoked for null arguments
        Objects.requireNonNull(b,()->"b may not be null " + getApplicationStatus());
        return  a.hashCode()^b.hashCode();
    }
}
