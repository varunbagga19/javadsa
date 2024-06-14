package oops.finalk;

public class MainClass extends Student 
{
    final int a =4;
    public void getDescp()
    {
        System.out.println("Inside main Class");
    }
    public static void main( String[] args) {
        
        MainClass obj = new MainClass();
        obj.getDescp();
        
    }
}
