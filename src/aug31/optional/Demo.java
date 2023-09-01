package aug31.optional;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        Student student = new Student(101,
                        "Gurpreet",
                        null,
                Arrays.asList("Maths","Science","Physics","History"));
       // System.out.println(student);
        Optional<Object> empty = Optional.empty();
        //System.out.println(empty);

        Optional<String> email = Optional.ofNullable(student.getEmail());
        //System.out.println(email.get());

       // System.out.println(email.orElse("defaultemail@gmail.com"));

       // System.out.println(email.orElseThrow(() -> new NoSuchElementException("Email not present")));

        // method reference
        System.out.println(email.map(String::toLowerCase).orElseGet(() -> "defaultEmail@gmail.com"));

    }
}
