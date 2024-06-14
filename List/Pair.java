package List;

public class Pair<X,Y>//DATA TYPE
{
    X x;
    Y y;
    public Pair (X x,Y y)
    {
        this.x=x;
        this.y=y;
    }
    public void getdescription()
    {
        System.out.println(x+" "+y);
    }
    
}
