import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {

    public static void isMatching(String sentence)
    {
        if(Pattern.matches("^[A-Z].*\\.$", sentence))

            System.out.println("Yes it begins with a capital letter and ends with a period.");
        else

            System.out.println("It does not match the given pattern");
    }

    public static void main(String[] args) throws IOException
    {
        String sentence;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Sentence");
        sentence=s.nextLine();
        isMatching(sentence);
    }

}

