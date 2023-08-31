package aug29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpListDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Peter",24 ));
        employeeList.add(new Employee("Dave",26 ));
        employeeList.add(new Employee("Mike",28 ));
        employeeList.add(new Employee("John",34 ));
        employeeList.add(new Employee("Jane",14 ));
        employeeList.add(new Employee("Jennifer",66 ));

        System.out.println(employeeList);
        long count = employeeList
                .stream()
                .filter(x -> x.age > 30)
                .count();

        System.out.println(count);

        // Optional classes --->
      // container --> which helps to handle or avoid null pointer exception

        String name  = null;

        /*Optional<String> name1 = Optional.ofNullable(name);
        if(name1.) {
            System.out.println(name.toLowerCase());
        }
        else {
            System.out.println("Nothing");
        }*/

        // Multithreading... -- how to create threads and how to run those


    }
}
