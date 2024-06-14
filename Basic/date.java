import java.util.*;
public class date 
{
    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("The day is Monday");
            break;

            case 2 : System.out.println("The day is Tuesday");
            break;
            case 3 : System.out.println("The day is Wednesday");
            break;
            case 4 : System.out.println("The day is Thursday");
            break;
            case 5 : System.out.println("The day is Friday");
            break;
            case 6 : System.out.println("The day is saturday");
            break;
            case 7 : System.out.println("The day is Sunday");
            break;
            default: System.out.println("Have a nice day");
            
        }
    }
    
}
