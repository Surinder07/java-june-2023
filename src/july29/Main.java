package july29;
/*

access modifier

private
public
protected
default


this
 */

import java.util.Properties;

class Student{
    // properties
    private int id;  // instance variabl e
    private String name;
    private String username;
     String password = "defualtpassword";
    // 10
    // this -- referes to the current class object / instance variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


}
public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setId(101);
        student.setName("John");
        System.out.println("*****");
        System.out.println(student.password);
        student.password = "sadfjhgaku gdaks";
        System.out.println(student.password);


        System.out.println(student.getId());
        System.out.println(student.getName());

        System.out.println(student.getPassword());


    }
}
