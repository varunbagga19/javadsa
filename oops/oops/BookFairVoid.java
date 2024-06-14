package oops;

import java.util.Scanner;

public class BookFairVoid
{
    String Bname;
    double price;
    public BookFairVoid()
    {
        Bname=" ";
        price = 0.0;
    }
    void input()
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Book name and price");
    Bname=sc.nextLine();
    price=sc.nextDouble();
    }
    void calculate ()
    {
        if (price<=1000)
        {
            price = price - (price*0.02);
        }
        else if(price >1000 && price<=3000)
        {
            price = price - (price*0.10);
        }
        else
        {
            price = price - (price*0.15);
        }
    }
    void display()
    {
        System.out.println("The name of the book is "+ Bname);
        System.out.println("The price of the book is "+ price);
    }
    public static void main(String[] args) 
    { 
        BookFairVoid BFV = new BookFairVoid();
        BFV.input();
        BFV.calculate();
        BFV.display();

        
    }
    
}
