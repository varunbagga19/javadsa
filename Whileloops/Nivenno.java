package Whileloops;

import java.util.Scanner;

public class Nivenno 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to check");
        int n = sc.nextInt();
        int sum=0;
        int temp=n;

        while(temp>0)
        {
            int l = temp%10;
            sum= sum+l;
            temp=temp/10;
        }
        System.out.println(sum);
        if (n%sum==0)
        {
            System.out.println("Its  an NIVEN number");
        }
        else
        {
            System.out.println("ITS not");
        }    

    }
    
}
