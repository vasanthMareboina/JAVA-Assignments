package javaAssignments;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment3 {
    public void getPingTime(String ipAddress) throws IOException {
        InetAddress inet = InetAddress.getByName(ipAddress);
        long finish;
        long start = new GregorianCalendar().getTimeInMillis();
        if(inet.isReachable(50000)){
            finish=new GregorianCalendar().getTimeInMillis();
            System.out.println("Ping time :"+(finish-start));
        }
        else{
            System.out.println("Ping not reachable");
        }
    }

    public static void main(String[] args) throws IOException{
        Assignment3 obj = new Assignment3();
        System.out.println("Enter ip address");
        Scanner  s = new Scanner(System.in);
        String ip = s.nextLine();
        obj.getPingTime(ip);
    }
}