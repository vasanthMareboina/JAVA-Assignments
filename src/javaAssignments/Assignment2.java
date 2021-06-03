package javaAssignments;

import java.util.Scanner;

public class Assignment2 {
    int  checkAlphabet(String input){
        int[] a = new int[26];
        int i=0;
        while (i<input.length()){
            if(input.charAt(i) >= 'a' && input.charAt(i) <='z'){
                a[input.charAt(i) -'a'] = 1;
            }
            else if(input.charAt(i) >='A' && input.charAt(i) <= 'Z'){
                a[input.charAt(i) - 'A'] = 1;
            }
            i++;
        }
        for(i=0;i<26;i++){
            if(a[i] != 1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Assignment2 obj = new Assignment2();
        System.out.println("Enter input......");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(obj.checkAlphabet(input) == 0 ){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
