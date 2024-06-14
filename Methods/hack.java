package Methods;

import java.util.Scanner;

public class hack 
{
     static int sizeOfString(String s)
    {
        int l=s.length();
        return l;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the word");
       String s1 = sc.nextLine();
        
        int k = sizeOfString(s1);
        System.out.println(k);
        
    }
    
}
