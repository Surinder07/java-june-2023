package aug15.innerDemo;

public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        // OuterClassName.InnerClassName obj = outerObjectRef.new InnerClass();
        OuterClass.InClass innerClassObj = outerClass.new InClass();
        innerClassObj.insideMethod();
        innerClassObj.x = 10;

    }
}
