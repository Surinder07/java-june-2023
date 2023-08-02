package aug1;

// default constructor
class DateDemo{

    private int day; // dec  // init
    private int month;
    private int year;

    DateDemo(){
        day = 1;
        month = 8;
        year = 2023;
    }

    public void printDate(){
        System.out.println("Date : " + day + " /" + month + " /"+ year);
    }
}
public class Test {
    public static void main(String[] args) {
        DateDemo dateDemo = new DateDemo(); // to create object
        dateDemo.printDate(); // this will print some default values

    }
}
