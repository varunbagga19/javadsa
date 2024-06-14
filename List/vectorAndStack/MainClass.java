package Lists.vectorAndStack;

import java.util.Stack;
import java.util.Vector;

public class MainClass 
{
    public static void main(String[] args) throws Exception
    {
       MyStack<Integer> stack = new MyStack<>();
       stack.push(12);
       stack.push(121);
       stack.push(1234);
      
       int pop = stack.pop();
       System.out.println(pop);
       int peek = stack.peek();
       System.out.println(peek);
        
    }
    
}
