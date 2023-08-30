package aug29;

import java.util.Arrays;
import java.util.List;

public class MoreStreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,4,343,5,4,54,5,4,65,6,5,6,5,65,2);

        nums.stream()
                .filter(x -> x%2 == 0) // Stream ---> 12 4 4 4 6  6 2

                .sorted()
                .forEach(x-> System.out.println(x));

       // System.out.println(nums);
        /*

         Set<Integer> collect = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
         */
    }
}
/*
intermediate operations/ methods
limit () --> limit the number of elements you want
skip(2)  --> its going to skip first two
distinct() --- > all the distinct elements will be printed out or collected


 */