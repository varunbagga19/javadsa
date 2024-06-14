package Forloop;

public class Namepattern 
{
    public static void main(String[] args) 
    {
       String s ="Varun";
       int l = s.length();
       for(int i =0;i<=l;i++)
       {
           for (int j =0;j<=i;j++)
           {
               System.out.print(s.charAt(j));
           }
           System.out.println();
        }
    }
    
}
