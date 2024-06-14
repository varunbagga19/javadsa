package oops;

import java.util.Scanner;

public class ParkingLot 
{
    int vno;
    int hours;
    double bill;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter VEHICHLE NUMBER,HOURS IN PARKING LOT ");
        vno=sc.nextInt();
        hours=sc.nextInt();
        
    }
    void calculate()
    {
        if(hours<=1)
        {
            bill=3;
        }
        else
        {
          bill = 3+(1.5*(hours-1));
        }
        
    }
    void display()
    {
        System.out.println("VEHICHLE NUMBER -: "+ vno);
        System.out.println("HOURS IN PARKING LOT -: "+ hours);
        System.out.println("TOTAL BILL -: "+ bill);
        
    }
    public static void main(String[] args) 
    {
       ParkingLot p = new ParkingLot();
       p.input();
       p.calculate();
       p.display();     
    }
    
    
}
