/**
 * Created by joel on 10/09/16.
 */
public class Stack {

    private Node head;
    private int sp;

    public Stack(){
        sp = 0;
    }


    public Stack(int a){
        head = new Node();
        sp = 0;
    }

    public void push(int a){
        Node pushNode = new Node(a);
        sp = sp+1;
        if(head.getNext()==null){
            head.setNext(pushNode);

        }else{
            Node temp = head.getNext();
            head.setNext(pushNode);
            pushNode.setNext(temp);
        }

    }

    public int pop(){
        int temp = 0;
        if(sp==0){
            System.out.println("Stack is empty");
        }else{
            temp = head.getNext().getData();
            sp = sp-1;
        }
        return temp;
    }

    public void print(){
        Node current = head.getNext();
        for (int i = 0; i <=sp; i++) {
            System.out.println("data is "+current.getData());
            current = current.getNext();
        }
    }
}
