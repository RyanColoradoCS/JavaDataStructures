class DoublyLinkedList {    

    class Node{ 

        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    // head, tail set to null
    Node head, tail = null;
    int length = 0;
   
    // add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = newNode;
            tail = newNode;
            head.previous = null;   
            tail.next = null;
        }  
        else {  
            //add newNode to the end of list
            tail.next = newNode;  
            //newNode.previous is set to tail
            newNode.previous = tail;
            newNode = tail;
            tail.next = null; 
        } 
        length++;
    }  

// Check if Node exists
// Delete Node
// Reverse Node

//print all the nodes 
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
