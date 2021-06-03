
class Exception1 extends Exception{
    Exception1(String s){
        super(s);
    }

}

class Exception2 extends Exception{
    Exception2(String s){
        super(s);
    }

}

class Exception3 extends Exception{
    Exception3(String s){
        super(s);
    }

}

public class Assignment8 {

    void methode1(int exception) throws Exception1,Exception2,Exception3,NullPointerException{
        if(exception == 1){
            throw new Exception1("Exception1");
        }
        else if(exception == 2){
            throw new Exception2("Exception2");
        }
        else if(exception == 3){
            throw new Exception3("Exception3");
        }
        else{
            throw new NullPointerException(" Null pointer Exception");
        }
    }

    public static void main(String[] args) {
        Assignment8 obj = new Assignment8();
        try{
            obj.methode1(2);
        }
        catch(Exception1 | Exception2 | Exception3 | NullPointerException e){
            e.printStackTrace();

        }
        finally {
            System.out.println("Finally clause");
        }
    }
}
