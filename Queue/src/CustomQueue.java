public class CustomQueue {

    private int length;
    private Node front; 
    private Node rear;

    public CustomQueue(){
        length = 0;
        front = rear = null;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
        } else {
            rear.setNextNode(node);
        }

        rear = node;
        length =  length + 1;
    }

    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("The queue is empty.");
        }
        // get first node
        int d = front.getData();

        // remove first node from front
        front = front.getNextNode();

        //  decrease length
        length = length -1;
        // if empty, set front to null
        if(isEmpty()){
            front = null;
        } 

        return d;
    }

    public int first() throws Exception {
        if(isEmpty()){
            throw new Exception("The queue is empty.");
        }

        // get first node
        int d = front.getData();
        return d;
    }

    public  boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }
}
