
public class Main{

    public static void main(String[] args){
        Node head = new Node();
        head.print();
        head = head.push(10);
        head.print();
        System.out.println("length "+head.length());
        head.append(111);
        System.out.println("length "+head.length());
    }
}
