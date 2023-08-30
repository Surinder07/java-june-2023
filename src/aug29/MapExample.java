package aug29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> productOf2 = nums
                .stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(productOf2);


        List<String> names = Arrays.asList("Peter", "Mike","John", "Jane","Dan",
                "Jennifer", "Jane","Dan","Jennifer");

        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        // convert all of these names to upper case
        // filter with length greater than 4

        // interview --> difference between map and flatmap  --> 100%

        //flatmap -- > is something which flatten the map
        // collection<collction>
        // List<List<String>>



    }
}
