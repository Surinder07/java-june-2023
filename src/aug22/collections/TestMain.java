package aug22.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(10);


        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        System.out.println(Collections.frequency(list, 10));
    }
}
