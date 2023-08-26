package aug26.inbuildLambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {


        // returns nothing accepts 1 parameter
        Consumer<String> consumer = (s) -> System.out.println(s.indexOf(0));
        consumer.accept("Surinde");

        // accepts two parameters and returns nothing
        BiConsumer<Integer, Integer> biConsumer = (num1, num2) ->
        {
            System.out.println(num1 + " " + num2);
        };
        biConsumer.accept(10, 20);

        // Boolean valued function , return boolean value and accepts 1 input
        Predicate<Integer> predicate = (i) -> i%2 ==0;
        System.out.println(predicate.test(5));

        //BiPredicate

        // https://www.w3resource.com/java-exercises/lambda/index.php


    }
}



// functional interface which accepts one input and returns nothing

// "   Pragra    "
// use consumer to remove white spaces
        /*

        @FunctionalInteface
        public interface Consumer<T> {

        void accept(T t);

        (st) -> {... implementaion }
        }

         */