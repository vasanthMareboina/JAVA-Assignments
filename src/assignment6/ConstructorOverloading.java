package assignment6;

public class ConstructorOverloading {
    private String variable1;
    private String variable2;


    ConstructorOverloading(String variable2){
        this.variable2 = variable2;
    }
    ConstructorOverloading(String variable1,String variable2){
        new ConstructorOverloading(variable2);
        this.variable1 = variable1;

    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading("Vasanth","Mareboina");
    }
}
