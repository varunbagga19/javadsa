package oops;

import java.util.Scanner;
class rotating
{
    int p;
    int n;
    int a[]= new int [n];
   
public int[] rotate(int b[],int a, int c)
{
    for (int i = 0;i<c;i++)
    {
        int temp= b[a-1];
        for(int j=a-1;j>0;j--)
        {
            b[j]=b[j-1];
        }
        b[0]=temp;
    }
    return b ;
}
// public void input()
// {
   
    
//}
// public void display()
// {
//     System.out.println("The rotated array upto  " + p +"is ");
//     for(int i = 0 ; i< n;i++)
//     {
//         System.out.println(a[i]);
//     }
// }  
    
}
public class rotatingCW
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the element of the array");
        for (int i = 0 ;i<n ;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the postion upto which you want array rotated");
        int p = sc.nextInt();
        rotating r = new rotating();
        //r.input();
        
        System.out.println("The rotated array is -  ");
        int c[] = r.rotate(a, n, p);
        for (int i = 0 ;i<0;i++)
        {
        System.out.println(c[i]);
        }
        
    }
}
