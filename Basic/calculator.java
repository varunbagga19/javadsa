
import java.util.*;
public class calculator 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the marsk out of 100");

     int maxmarks = 500;
     System.out.println("Enter the marks of subject 1-:");
     float a = sc.nextInt();
     System.out.println("Enter the marks of subject 2-:");
     float b = sc.nextInt();
     System.out.println("Enter the marks of subject 3-:");
     float c = sc.nextInt();
     System.out.println("Enter the marks of subject 4-:");
     float d = sc.nextInt();
     System.out.println("Enter the marks of subject 5-:");
     float e = sc.nextInt();
     float sum=a+b+c+d+e;
     System.out.println(sum);
     float p =(sum/maxmarks)*100;
     System.out.println("The percentage of the student is -:"+p);

 }
}
