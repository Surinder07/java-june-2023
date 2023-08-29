package aug26.inbuildLambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;
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

        // input nothing --> returns value
        Supplier<String> supplier = () -> "Hello How are you ?";
        String s = supplier.get();
        System.out.println(s);


        //
        Function<String, Integer> function = st -> st.length();
        System.out.println(function.apply("Surinder"));

        BiFunction<Integer, Integer, Integer> func = (a, b) -> a+b;
        System.out.println(func.apply(10, 20));


        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(132);
        list.add(1243);
        list.add(1243);
        list.add(1243);



                // create a class Student
        // name email phone Address

        // Address ---> city , county , postal code
        // main class -- Student
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