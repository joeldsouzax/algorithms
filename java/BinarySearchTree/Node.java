
public class Node{
        
    private int data;
    private Node left;
    private Node right;

    public Node(){
    
    }

    public Node(int data){
    this.data = data;
    }

    public Node(Node left, Node right, int data){
    this.data = data;
    this.left = left;
    this.right = right;
    }

    int getData(){
    return data;
    }

    Node getLeft(){
    return left;
    }

    Node getRight(){
    return right;
    }

    void setData(int data){
    this.data = data;
    }

    void setLeft(Node left){
    this.left = left;
    }

    void setRight(Node right){
    this.right = right;
    }

    public String toString(){
    return "Data = "+data+", left Node data "+left.getData()+", right Node data "+right.getData();
    }
}
