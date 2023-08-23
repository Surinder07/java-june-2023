package aug22.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // no duplicates
        // does not maintain the order

        // HashSet   --- > no order
        // Treeset --- > sorted order
        // LinkedHasSetv --> maintains insertion order
        Set<Integer> set = new TreeSet<>();
        set.add(130);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(433);
        System.out.println(set);


    }
}
