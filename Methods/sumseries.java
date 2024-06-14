package Methods;

public class sumseries 
{
    void SumSeries(int n , double x)
    { 
        double s=0 ;
        int sign=1;
        for (int i = 1;i<=n;i++)
        {
            s = s+x/i*sign;
            sign*=-1;
        }
        System.out.println(s);

    }
    void SumSeries()
    {
        int sum=0;
        for(int i=1;i<=20;i++)
        {int f=1;
            for (int j = 1;j<=i;j++)
            { 
                f = f*j;
            }
            sum=sum+f;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) 
    {
      sumseries ss= new sumseries();
      ss.SumSeries(2,4);
      ss.SumSeries();

    }
    
}
