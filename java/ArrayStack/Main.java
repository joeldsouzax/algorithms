
public class Main{

        
    public static void main(String[] args){

        Stack all = new Stack();
        all.push(2);
        all.print();
        all.push(1);
        all.print();
        System.out.println(all.pop());
        all.push(10);
        all.print();
        all.push(100);
        all.push(100);
        all.push(100);
        all.push(100);
        all.push(100);
        all.push(100);
        all.push(100);
        all.push(100);
        all.print();
        System.out.println(all.pop());
        all.print();
        all.push(12);
        all.print();
        all.push(56);
        Stack newstack = new Stack(20);
        newstack.print();
        newstack.push(10);
        newstack.print();
    }

}
