/* author Joel */


public class Node{

    private int data;
    private Node next;

    Node(int data){
    this.data = data;
    }

    void nextlink(Node next){
    this.next = next;
    }

    int getdata(){
    return data;
    }

    void print(){
    System.out.println("The data is "+data);
    System.out.println("The data in the next node is "+next.getdata());
    }
}
