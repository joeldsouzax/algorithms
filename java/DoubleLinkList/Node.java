
public class Node{

    private int data;
    private Node next;
    private Node previous;
        
        
    public Node(){
    
    }


    public Node(int data){
        this.data = data;
    }

    public Node(Node next, int data){
    this.data = data;
    this.next = next;
    }

    public Node(Node next, Node previous, int data){
    this.data = data;
    this.next = next;
    this.previous = previous;
    }

    int getData(){
    return data;
    }

    void setNext(Node next){
    this.next = next;
    }

    void setPrevious(Node previous){
    this.previous = previous;
    }

    Node getNext(){
    return next;
    }

    Node getPrevious(){
    return previous;
    }

    Node push(int data){
    Node head = new Node(data);
    head.setNext(this);
    this.setPrevious(head);
    return head;
    }

    int length(){
    Node current = this;
    int count = 0;

    while(current != null){
    current = current.getNext();
    count++;
    }
    return count;
    }

    void append(int data){
    Node tail= new Node(data);
    Node current = this;
    while(current.getNext() != null){
    current = current.getNext();
    }
    current.setNext(tail);
    tail.setNext(null);
    tail.setPrevious(current);
    }

    void print(){
    System.out.println("data "+data);
    System.out.println("next  "+next);
    System.out.println("previous "+previous);
    }
}
