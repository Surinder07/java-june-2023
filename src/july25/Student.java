package july25;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // overridden method -- Object class
    public static void main(String[] args) {

        Student student = new Student();
        student.age = 15;
        student.name = "Peter";

        System.out.println(student);
    }
}
