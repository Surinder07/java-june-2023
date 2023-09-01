package aug31;

import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Integer max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a,b) -> Integer.max(a,b));
        System.out.println("Max of the number :  " + max);


    }
}
