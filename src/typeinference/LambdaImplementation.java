package typeinference;

import java.util.function.Consumer;

public class LambdaImplementation {
    public static void main(String[] args) {
        System.out.println("Anonymous Class");

        for(int i=0;i<5;i++)
        {
            Consumer<String > myPrinter= new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println("Consuming ->"+s);
                }
            };
            myPrinter.accept(myPrinter.toString());
        }


        System.out.println("Non Capturing Lambda");

        for(int i=0;i<5;i++)
        {
            Consumer<String > myPrinter=msg-> System.out.println("Consuming ->"+msg);

            myPrinter.accept(myPrinter.toString());
        }

        System.out.println("Constant Capturing Lambda");
        final int secret=28;
        for(int i=0;i<5;i++)
        {
            Consumer<String > myPrinter=msg-> System.out.println("Consuming ->"+msg+"---->"+secret);

            myPrinter.accept(myPrinter.toString());
        }
        System.out.println("Instance Capturing Lambda");
         int id=10;
        for(int i=0;i<5;i++)
        {
            Consumer<String > myPrinter=msg-> System.out.println("Consuming ->"+msg+"---->"+id);

            myPrinter.accept(myPrinter.toString());
        }

    }
}
