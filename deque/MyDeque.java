public class MyDeque<E> 
{
    Node<E> head,tail;
    public void addToHead(E data)
    {
        Node<E> toAdd = new Node<>(data);

        if(head==null)
        {
            head=tail=toAdd;
            return;
        }
          
        head.next = toAdd;
        toAdd.prev = head;
        head = toAdd;
    }
    public E removeFirst()
    {
        if ( head== null)
        {
            return null;
        }
        Node<E> toRemove =head;        
        head= head.next;
        return toRemove.data;
    }
    public void addLast(E data)
    {
        Node<E> toAdd = new Node<>(data);
        if (head==null)
        {
            head=tail=toAdd;
            return;
        }
        tail.next=toAdd;
        toAdd.prev = tail;
        tail=toAdd;
    }
    public E removeLast()
    {
        if ( head == null)
        {
            return null;
        }
        Node<E> toRemove = tail;
        tail= tail.next;
        tail.prev=null;
        return toRemove.data;

    }
    public static class Node<E>
    {
        E data;
        Node <E> next,prev;

        public Node(E data)
        {
            this.data = data;
            this.next=this.prev=null;
        }

    }

    
}
