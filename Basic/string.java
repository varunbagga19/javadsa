package Basic;

import java.util.*;

public class string 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        String s =sc.nextLine();
        int l = s.length();
        int sum = 0;
        String temp="";
         for (int i = 0 ;i<l;i++)
         {
             char ch = s.charAt(i);
             if(Character.isDigit(ch))
             {
                 temp += ch;

             }
             else
             sum += Integer.parseInt(temp); 
             temp="0";

         }

         System.out.println("The sum of numbers in string is "+ sum);

        
    }
    
}
