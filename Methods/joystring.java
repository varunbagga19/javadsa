package Methods;



public class joystring 
{
  static void Joystring (String s , char ch1,char ch2)
   {
      s= s.replace(ch1, ch2);
      System.out.println(s);   
   }   
   static void Joystring(String s3)
   {
       int l = s3.indexOf(" ");
       int l1 =s3.lastIndexOf(" ");
       System.out.println("First index = "+ l);
       System.out.println("Last index = "+ l1);
   }
   static void Joystring(String s1,String s2)
   {    
       String s4= s1+" "+s2;
       System.out.println(s4);
       
   }
   public static void main(String[] args) 
   {
    

    //    joystring js = new joystring();
       Joystring("TECHNALAGY", 'A', 'O');
    Joystring("COMMON WELATH ", "GAMES");
    Joystring("VARUN HAS APPLE MACBOOK AIR WITH M1");





       
   }
}
