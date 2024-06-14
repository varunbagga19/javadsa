package oops.inheritence.polymorphism;

public class MainClass 
{
    public static void main(String[] args) 
    {
        // Dog d = new Dog();
        Pet p = new Pet();
        Dog d = p;
        Animal a =p;
        
        d.walk();
        p.walk();
    

        // Pet p = d;
        // Animal a =d;
        // d.walk();
        // p.walk();
        // greetings();
        
        
    }
    // public static void greetings()
    // {
    //     System.out.println("hi");
    // }
    // public static void greetings(String s)
    // {
    //     System.out.println();
    // }
  

    
}
