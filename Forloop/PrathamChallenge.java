package Forloop;

import java.util.Scanner;

public class PrathamChallenge {
    
public static void main(String[] args) 
{
    Scanner sc = new Scanner (System.in);
    System.out.println(" Enter the size of the pattern   ");
    int n= sc.nextInt(); 
    int f=1;
    for (int i =1;i<=n;i++)
    {
        if (i%2==1)
        {
        for(int j=1;j<i-1;j++)
        {
            System.out.print("  ");
        }
        for(int k=1;k<=n-i+1;k++)
        {
            System.out.print(f+"   ");
            f++;
        }
        
        System.out.println();
    }
    else {
        continue;
    }
    }
    }
  }
 
