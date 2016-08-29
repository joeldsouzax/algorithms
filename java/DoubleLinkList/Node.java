
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

    void print(){
    System.out.println("data "+data);
    System.out.println("next  "+next);
    System.out.println("previous "+previous);
    }
}
