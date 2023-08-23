package aug22.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // stack ? LIFO -->

        Stack<String> names = new Stack<>();
        names.add("Surinder"); // added first (bottom )
        names.add("Azim");
        names.add("Chirag");
        names.add("Mohit");
        names.add("Anubhav"); // added  last --- (top )

        // push and pop
        // push --- > add element
        // pop ---> remove

        System.out.println(names.peek());

        names.pop();
        System.out.println(names);


    }
}
