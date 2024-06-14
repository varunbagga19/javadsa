import java.util.*;
public class is_int {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int a = sc.nextInt();
        if(a == (int)a){
            System.out.println("integer");
        }
        else{
            System.out.println("not");
        }

    }
}
