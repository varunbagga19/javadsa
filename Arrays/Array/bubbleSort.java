
package Array;
import java.util.Scanner;

public class bubbleSort
 {
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
         int n = sc.nextInt();
        int a []= new int[n]; 
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }  
        //Bubble sorting starts
        for(int  k = 0 ;k<n;k++)
        {
            for (int j = 0 ;j<n-k-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.print("The sorted array is -:");
        for(int item:a)
        {
            System.out.println(item);
        }
     }
    
}
