import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int firststr = A.length();
        int secondstr = B.length();
        
        int res = firststr + secondstr;
        System.out.println(res);
        
        int out = A.compareTo(B);
        if(out < 0)
        {
            System.out.println("No");
        }
        if(out > 0)
        {
            System.out.println("yes");
        }
        
        String firstLetA = A.substring(0,1);
        String remLetA = A.substring(1);
        firstLetA = firstLetA.toUpperCase();
        String concatA = firstLetA + remLetA;
        
        String firstLetB = B.substring(0,1);
        String remLetB = B.substring(1);
        firstLetB = firstLetB.toUpperCase();
        String concatB = firstLetB + remLetB; 
        
        System.out.println(concatA+" "+concatB);       
    }
}



