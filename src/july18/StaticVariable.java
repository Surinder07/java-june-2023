package july18;

public class StaticVariable {
    int id ;
    String firstName ;
    static String course = "Java";
    // database --- > connection properties
// constructor..
    public StaticVariable(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
    public  void setValue()
    {
        System.out.println(id + " " +firstName + " " + course);
    }
    public static void main(String[] args) {

        StaticVariable s = new StaticVariable(101, "Tony");
        s.setValue();

        StaticVariable s1 = new StaticVariable(102,"Mike");
        s1.setValue();

        StaticVariable s2 = new StaticVariable(102,"Peter");
        s2.setValue();

    }
}

/*  create class -- circle
    static variable -- PI - 3.14
    double radius  --> instance variable

    static create method --- calculateArea(radius)
    this method should return the area of the circle.





 */