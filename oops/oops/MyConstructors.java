package oops;

class Vehicle
{
    int wheels;
    int headLights;
    String color;

    Vehicle(int noofWheels)
    {
        wheels = noofWheels;
        headLights=2;
    }
    Vehicle(int wheels,String color)
    {
        this.wheels = wheels;
        this.color = color;
    }
}

public class MyConstructors 
{
    MyConstructors()
    {
        System.out.println("Object is now created");
    }
    public static void main(String[] args)
     {
         MyConstructors obj = new MyConstructors(); 
         Vehicle car = new Vehicle(4);
         Vehicle scooty = new Vehicle(5,"blue");

         //System.out.println(scooty.wheels);
         System.out.println(scooty.wheels+ "   "+ scooty.color);
    }
    
}
