package aug22.collections;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        // List - interface ==  Arraylist
        // we can assign child object to parent class/interface reference
        // generics -- which restrict data struct to a type
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the list of 6 numbers ");
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        list.remove(0);
        System.out.println(list);

        /*for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }*/

        /*for (Integer element : list) {
            System.out.println(element);
        }*/


        // Iterator
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //System.out.println(list);

        // int arr[] = new int[5];



    }
}



// data structures
// array list ----> when you want to search elements
// linked list --- > modification.

// doubly linked ---- > it has the address of previous node