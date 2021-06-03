package assignment6;

public class ConstructorArgument {

    ConstructorArgument(String variable){
        System.out.println("Argument passed to constructor is : "+variable);
    }

    public static void main(String[] args) {
        ConstructorArgument[] references = new ConstructorArgument[5];
        for(int i=0;i<5;i++){
            references[i]=  new ConstructorArgument("Vasanth"+i);
        }
       // System.out.println(references);
    }
}
