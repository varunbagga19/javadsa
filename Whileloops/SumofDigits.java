package Whileloops;
import java.util.*;
public class SumofDigits
{
       public static void main(String[] args) 
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          int temp = n;
          int sum =0;
          int k = 1;
          while(temp>0)
          {
              int l = temp%10;
              temp/=10;
              sum+=l;
              k++;

          }
            System.out.println("The sum of digit "+n+" is "+ sum );
            System.out.println("The number of digits will be "+(k-1));

      }
    
}
