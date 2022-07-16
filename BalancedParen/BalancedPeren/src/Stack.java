public class Stack <Item> 
{
    private Node first;
    private int size;

    Stack()
    {
        this.first = null;
        this.size = 0;
    }

    // nested class
    private class Node
    {
        Item item;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    // push
    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }

    // pop
    public Item pop()
    {
        Item it = first.item;
        first = first.next;
        size--;
        return it;
    }


}
