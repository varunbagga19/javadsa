package Forloop;
import java.util.*;
public class pattern5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the size of the pattern");
        int n= sc.nextInt(); 
        for (int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}