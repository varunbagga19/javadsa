package queue;

import java.util.*;
public class MainClass 
{
    public static void main(String[] args) 
    {
       MyQueue<Integer> mq = new MyQueue<>();
       mq.enqueue(12);
       mq.enqueue(2);
       mq.enqueue(32);
       mq.enqueue(13);
       
       System.out.println(mq.dequeue());
       System.out.println(mq.dequeue());
       System.out.println(mq.dequeue());

    }
    
}
