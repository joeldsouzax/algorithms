
public class Stack{

    private int [] stackarray;
    private int top = -1;

    Stack(){
    
        stackarray = new int[10];
    
    }


    Stack(int a){
    
        stackarray = new int[a];
    
    }

    void push(int a){

        if(top>=stackarray.length-1){
        System.out.println("reached its limit");
        }else{
        top = top+1;
        stackarray[top] = a;
        }
    }

    int pop(){
        int temp = 0;
    if(top>0){
    temp =stackarray[top];
    stackarray[top] = 0;
    top = top-1;
    }else{
    System.out.println("Stack is empty");
   }

    return temp;
}
   void print(){
   
   for(int i = 0; i<=top;i++){
   System.out.println("stack: a "+"["+i+"] is "+stackarray[i]);
   }
   System.out.println("Top = "+top);
   }
}
