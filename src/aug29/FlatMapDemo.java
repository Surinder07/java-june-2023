package aug29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<String> names1 = Arrays.asList("Peter", "Mike","John", "Jane","Dan");
        List<String> names2 = Arrays.asList("Eva", "Chirag","Prachi", "Jasmine","Mohit");
        List<String> names3 = Arrays.asList("Peter", "Gupreet","John", "Alka","Azim");




        List<List<String>> allNames = Arrays.asList(names1, names2, names3);

        // create a new list

       /* for (List<String> newNames : allNames) {
            for

        }*/

        System.out.println(allNames);

        List<String> newList = allNames
                .stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(newList);




    }
}
