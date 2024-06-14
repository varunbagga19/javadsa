package Array;

import java.util.Scanner;

public class selectionSort
{
   public static void main(String[] args) 
   {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size ");
         int n = sc.nextInt();
         System.out.println("Enter the elements");
         int a [] = new int [n];
         for(int i = 0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         for(int i=0;i<n-1;i++)
         {
             int minIndex=i;
             for(int j = i ;j<n;j++)
             {
                 if(a[j]<a[minIndex])
                 {
                     minIndex = j;
                 }
             }
         
         int temp = a[i];
         a[i]= a[minIndex];
         a[minIndex]= temp;
         
   } 
   System.out.println("The sorted array ");
         for(int f:a)
         {
             System.out.println(f);
         }
}
}