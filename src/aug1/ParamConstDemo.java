package aug1;

class DateTest{
    private int day; // dec  // init
    private int month;
    private int year;

    DateTest(){
        day = 1;
        month = 8;
        year = 2023;

    }

    public DateTest(int day) {
        this.day = day;
    }
    public DateTest(int day, int month, int year) {
        this();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate(){
                System.out.println("Date : " + day + " /" + month + " /"+ year);
    }
}
public class ParamConstDemo {
    public static void main(String[] args) {

        DateTest dateTest1 = new DateTest();
        dateTest1.printDate();

        DateTest dateTest2 =  new DateTest(10, 8, 2023);
        dateTest2.printDate();

    }
}

// Java 11  , jshell
// 17 --> changes in switch case
// record(String name, String email)