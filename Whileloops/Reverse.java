package Whileloops;
import java.util.*;
public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0)
        {
            int l =temp%10;
            rev=rev*10+l;
            temp/=10;
        }
        if(n == rev)
        {
            System.out.println("The number is palindrome number");

        }
        else
        {
            System.out.println("It is not ");
        }
    }  

    
}
