package javaAssignments;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Assignment4 {
    public static void getDates(Calendar signUpDate,Calendar currentDate){
        if(signUpDate.compareTo(currentDate) >0){
            System.out.println("No Range");
        }
        else{
            Calendar kycDate=Calendar.getInstance();
            kycDate.set(currentDate.get(Calendar.YEAR), signUpDate.get(Calendar.MONTH), signUpDate.get(Calendar.DAY_OF_MONTH));

            //date before 30 days of sign up anniversary
            kycDate.add(Calendar.DAY_OF_MONTH, -30);
            System.out.print(new SimpleDateFormat("dd-MM-yyyy").format(kycDate.getTime()));

            //date after 30 days of sign up anniversary
            kycDate.add(Calendar.DAY_OF_MONTH, 60);

            //if the current date is before the range
            if(kycDate.compareTo(currentDate)>0)
            {
                System.out.print(" "+new SimpleDateFormat("dd-MM-yyyy").format(currentDate.getTime()));
            }
            else
                System.out.print(" "+new SimpleDateFormat("dd-MM-yyyy").format(kycDate.getTime()));
            System.out.println();
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        Scanner s = new Scanner(System.in);
        int numberOfDates = s.nextInt();
        int i=0;
        String date;
        String[] signupDates = new String[numberOfDates];
        String[] currentDates = new String[numberOfDates];
        while(i< numberOfDates){
            signupDates[i] = s.next();
            currentDates[i] = s.next();
            i++;
        }
        i=0;
        Calendar signupDate= Calendar.getInstance(),currentDate = Calendar.getInstance();
        while(i<numberOfDates){
            signupDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(signupDates[i]));
            currentDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(currentDates[i]));
            getDates(signupDate,currentDate);
            i++;
        }
    }

}
