package Methods;

public class modin

{
    static int calc (int a,int b)
    {
        int c;
        if (a>b)
        {
            c=a+b;
        }
        else
        {
            c=(a+b)*5*a;
        }
          return c;
    }
    public static void main(String[] args)
    {
        
        int z = calc (2,1);
        System.out.println(z);
        
    }
}