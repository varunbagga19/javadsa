package Practice;

import java.util.Scanner;

public class r 
{
    
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            int a= sc.nextInt();
            int b[]= new int [a];
            for (int u = 0 ;u<a;u++ )
            {
                b[u]= sc.nextInt();
            } 
            for (int i = 0;i<c;i++)
            {
                int temp= b[a-1];
                for(int j=a-1;j>0;j--)
                {
                    b[j]=b[j-1];
                }
                b[0]=temp;
            } 
            System.out.println("The rotated array is ");
            for (int i = 0;i<a;i++)
            {

            System.out.println(b[i]);
        }
    }
    
    
    
}
