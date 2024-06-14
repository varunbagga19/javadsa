package vectorAndStack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean isBalanced= true;
        sc.nextLine();
        while(t--!=0)
        {
            String s = sc.nextLine();
            Stack<Character> ss = new Stack<>();
            for (int i =0;i<s.length();i--)
            {
                char ch = s.charAt(i);
                {
                    if (ch=='('||ch=='{'||ch=='[')
                    {
                        ss.push(ch);
                        continue;
                    }
                    if (ch==')')
                    {
                        if (ss.peek()=='(')
                        {
                            ss.pop();
                        }
                        else 
                        {
                            isBalanced= false;
                            break;
                        }
                    }
                    if (ch=='}')
                    {
                        if (ss.peek()=='{')
                        {
                            ss.pop();
                        }
                        else 
                        {
                            isBalanced= false;
                            break;
                        }
                    }
                    if (ch==']')
                    {
                        if (ss.peek()=='[')
                        {
                            ss.pop();
                        }
                        else 
                        {
                            isBalanced= false;
                            break;
                        }
                    }
                    
                }
                 if (ss.isEmpty())
                 {
                     isBalanced= false;
                 }
                 if (isBalanced)
                 {
                     System.out.println("balanced");
                 }
                 else 
                 {
                     System.out.println("Not balanced");
                 }
            }
           
        }
        
    }
    
}
