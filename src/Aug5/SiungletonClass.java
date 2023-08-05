package Aug5;

import java.util.Collections;

final class Student{

    private static Student INSTANCE;
    private Student(){

    }
    public static Student getInstance(){
        if(INSTANCE == null) {
            return new Student();
        }
        return INSTANCE;
    }
}
public class SiungletonClass {
    public static void main(String[] args) {


    }
}
