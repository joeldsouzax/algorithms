
public class Main{
public static void main(String[] args){
Stack arrayStack = new Stack(20);
arrayStack.load("path/to/input/file.txt");
arrayStack.print();
arrayStack.store("path/to/output/file.txt");
}
}
