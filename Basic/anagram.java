package Basic;

import java.util.Scanner;

public class anagram 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 Strings");
        String s = sc.nextLine();
        String s1= sc.nextLine();
        int l = s.length();
        int m = s1.length();
        int k=0 ;
        if (l==m)
        {
            for ( int i=0;i<l;i++)
            {
                 
                for(int j = i;j<m;j++)
                {
                    if (s.charAt(i)==s.charAt(j))
                    {
                      k++;
                      break;
                    }
                }
                
            }
            if (k==l)
                {
                    System.out.println("The String is anagram");
                }
                else
                {
                    System.out.println("it is not an anagram");
                }
        }
        else
        {
          System.out.println("It is not an anagram");
        }

        
    }
    
}
