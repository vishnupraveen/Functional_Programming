package typeinference;

import java.util.function.Consumer;

public class LambdaInference
{
    public static void main(String[] args) {
        //Standard Syntax
        Consumer<String> c1=msg-> System.out.println(msg.length());

    /*    //Compile Time error as information not enough
        Object a =msg-> System.out.println(msg.length);
            //Still not enough information
        Object a =(String)msg-> System.out.println(msg.length);*/
    //Explicitly type case
    Object a= (Consumer<String>)((String msg)-> System.out.println(msg.length()));



    }
}
