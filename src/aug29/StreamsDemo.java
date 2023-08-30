package aug29;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
// 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,23,25
        // print all the numbers using streams greater than 10 and less than 20
        // take a list of String --> "Peter", "Mike","John", "Jane","Dan","Jennifer"
        // filtter the name starts with J
        // filter with length of string greater than 4


        // after java 8

        // consumer --> input but not return
        list.stream().filter(x -> x %2 !=0).forEach( x -> System.out.println(x));

        List<Integer> oddNumbers = list
                .stream()
                .filter(x -> x % 2 != 0 && x > 4)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<String> names = Arrays.asList("Peter", "Mike","John", "Jane","Dan",
                "Jennifer", "Jane","Dan","Jennifer");
        List<String> namesWithJ = names
                .stream()
                .filter(x -> x.startsWith("J"))
                .filter(p -> p.length()> 4)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(namesWithJ);

        // get the maxium of employee


    }
}

// even nos
       /* for (Integer newList: list) {
            if(newList %2 ==0){
                System.out.print(" "+newList);
            }
        }*/