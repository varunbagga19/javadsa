package Methods.Reccursion;

import java.util.Scanner;

public class Factorial 
{

     int fact(int x)
     {
         if (x<2)
         {
             return 1;
         }
         else
         {
             return x*fact(x-1);
         }
     }

   public static void main(String[] args) 
   {
       Factorial fc = new Factorial();
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number of which you want the factorial");
       int n = sc.nextInt();
       int z = fc.fact(n);
       System.out.println("The factorial of the number "+ n +" -: "+ z );
   }   
}
