package interfacefeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> c=i->System.out.println(i);
        values.forEach(c);
    }
}
