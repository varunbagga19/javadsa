package Array;

import java.util.Scanner;

public class WondersOfWorld 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);
      String w [] ={ "CHICHEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICHU","PETRA","COLOSSEUM"};
      String la [] ={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","PETRA","ITALY"};
      System.out.println("Enter the name of the country");
      String s = sc.next();
      int k = la.length;
      int f =0;
      int i;
      for(i= 0;i<k-1;i++)
      {
          if(s.equalsIgnoreCase(la[i]))
          {
              f++;
              break;
          }

      }
      if (f==1)
      {
          System.out.println("NAME OF COUNTRY : "+ s+ "    WONDER: "+ w[i]);
      }
      else 
      {
        System.out.println("NAME OF COUNTRY : "+ s+ "    WONDER: NOT found");
      }

        
    }
    
}
