package oops;

class cat
{
     boolean hasFur;
     String color,breed;
     int legs,eyes;

     public void walk()
     {
         System.out.println("Cat is walking");
     }
     public void eat()
     {        
          System.out.println("Cat is eating");
     }
     public void descrp()
     {
         System.out.println(" MY cat has "+ legs + " And eyes "+ eyes);
     }
}

class dog
{
    String breed,name;

    public void jump()
    {
        System.out.println("My dog " + name + " jumped");
    }
 
      public void descp()
    {
         System.out.println("My dog breed is  "+ breed );
    } 


}
public class MainClass 
{
    public static void main(String[] args)
    {
        // cat cat1 = new cat();
        // cat cat2 = new cat();
        dog dog1 = new dog();
        dog dog2 = new dog();
        dog1.name="Harry";
        dog2.name="Potter";
        dog1.breed="husky";
        dog2.breed="poodle";
        dog2.descp();
        dog1.jump();

        // cat1.legs=2;
        // cat1.eyes=4;
        // cat2.eat();
        // cat1.walk();
        // cat1.descrp();
        // cat2.descrp();
    }
    
}
