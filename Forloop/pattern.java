import java.util.*;
public class pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the size of the pattern");
        int n= sc.nextInt();
        for(int j =1;j<=n;j++)
        {
        for(int i =1;i<=n;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        }
       
    }
    
}

