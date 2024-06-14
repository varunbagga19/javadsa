package Forloop;

import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
      int n = sc.nextInt();
       int a [] = new int[n]; 
       System.out.println("Enter the element");
       for (int i = 0;i<n;i++)
       {
           a[i]= sc.nextInt();
       }
       for (int i =0;i<n-1;i++)
       {
           for (int j =0;j<n-1-i;j++)
           {
               if(a[j+1]>a[j])
               {
                   int temp=a[j+1];
                   a[j+1]=a[j];
                   a[j]= temp;
               }
           }
       }
       System.out.println("The sorted array is -:");
       for(int w: a)
       {
           System.out.println(w);
       }
    }
    
}
