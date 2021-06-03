package vasanth.assignment.singleton;

public class ClassTwo {

    String variable;
    public static ClassTwo returnObject(String word)
    {
        //A static method cannot access non-static variables or methods.

        //variable=word;
        return new ClassTwo();
    }
    public void printString()
    {
        System.out.println(variable);
    }
}
