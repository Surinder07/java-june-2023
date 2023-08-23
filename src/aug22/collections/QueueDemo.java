package aug22.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();

        queue.offer(12); // first person in tim hortons line
        queue.offer(32);
        queue.offer(42);
        queue.offer(52); // last person

        System.out.println(queue);

        // remove
        queue.poll();
        System.out.println(queue);

        //next in the line
        System.out.println(queue.peek());

    }
}
