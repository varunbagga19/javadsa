package Practice;

import java.util.Scanner;

public class FirstPro 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("1) Floyds Triangle");
       System.out.println("2) To display the following pattern");
       System.out.println("Enter the Number for the following choices");
       int n = sc.nextInt();
        
       switch(n)
       {
           case 1: int f =1;
                   System.out.println("Enter the length upto which you want floyds triangle");
                   int k = sc.nextInt();
                   for(int i = 0;i<=k;i++)
                   {
                       for(int j = 0;j<i;j++)
                       {
                       System.out.print(f+ " " );
                       f++;
                       }
                       System.out.println();
                   }
                
                   break;
            case 2: System.out.println("Enter the choice of the String");
                    String s = sc.next();
                    s=s.toUpperCase();
                    int l= s.length();
                    for(int i = 0;i<=l;i++)
                   {
                       for(int j = 0;j<i;j++)
                       {
                       System.out.print(s.charAt(j)+ " " );
                       }
                       System.out.println();
                    } 
                    break;
            default :
            System.out.println("Invalid Input");         

       }
    }
    
}
