package Forloop;

import java.util.Scanner;

public class pattern8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length ");
        int n =sc.nextInt();
        for (int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print(" # ");
                }
                else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        
    }
    
}
