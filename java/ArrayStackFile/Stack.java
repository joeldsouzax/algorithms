import java.io.*;

public class Stack{

    /* Creating variables for stack array, pointer, file output and file input*/

    private int [] stk;
    private int sp;
    private PrintWriter fout;
    private BufferedReader fin;

    /* creating a defualt constructor*/
    public Stack(){
    stk = new int[10];
    sp = 10;
    }

    /* creating a variable array size constructor*/

    public Stack(int a){
    stk = new int[a];
    sp = a;
    }

    public int pop(){
    int temp = 0;
    if(sp==stk.length){
    System.out.println("Stack is not empty");
    }else{
    temp = stk[stk];
    sp = sp+1;
    }
    return temp;
    }

    public void push(int a){
    if(sp==0){
    System.out.println("Stack overflow");
    }else{
    sp = sp-1;
    stk[sp] = a;
    }
    }

    public void print(){
    for(int i = stk.length-1; i>=sp;i--){
    System.out.println("stk ["+i+"] = "+stk[i]);
    }
    }

    public void flush(){
    sp = stk.length;
    }

    public void load(String a) throws IOException{
    
    fin = new BufferedReader(new FileReader(a));
    this.flush();
    String str = fin.readLine();
    while(str !=null){
    int intPar = Integer.parseInt(str);
    this.push(intPar);
    str = fin.readLine();
    }
    
    }


    public void store(String a) throws IOException{
    
    fout = new PrintWriter(new BufferedWriter(new FileWriter(a)),true);
    for(int i = stk.length-1; i>=sp;i--){
    fout.println(a[i]);
    }
    }


    public int peek(){
    int temp = 0;
    if(sp == stk.length){return temp;}else{
    temp = stk[sp];
    }
    return temp;
    }

}
