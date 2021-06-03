package vasanth.assignment.main;

import vasanth.assignment.data.ClassOne;
import vasanth.assignment.singleton.ClassTwo;

public class MainClass {
    public static void main(String[] args) {
        ClassOne object1=new ClassOne();
        object1.printVariables();
//		object1.printLocalVariables();
        ClassTwo object2=ClassTwo.returnObject("Abc");
        object2.printString();
    }
}
