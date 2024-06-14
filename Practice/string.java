package Practice;

import java.util.Scanner;

public class string
{
   public static void main(String[] args) 
   { 
       Scanner sc = new Scanner (System.in); 
       System.out.println("Enter the string you want to check ");
       String s = sc.next();
       String rev = "";
       int l =s.length();
       for(int i = l-1 ;i>=0;i--)
        {
            rev= rev + s.charAt(i);
        }
              if (s.equals(rev))
              {
                  System.out.println("Pallindrome string");
              }


               else if (s.charAt(0)==s.charAt(l-1))
               {
                   System.out.println("Special word");
                } 
                else 
                {
                    System.out.println("NIETher of them");
                } 
     
       
    }
 }

