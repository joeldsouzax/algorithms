#include <stdio.h>

struct stack{
char arr[4];
int top;
};

struct stack * create();
void push(struct stack *a, char);
char pop(struct stack *a);


int main(){

struct stack * stackinstance = create();
push(stackinstance,"a");
return 0;
}


struct stack * create(){
struct stack * st = malloc(sizeof(struct stack));
st->top = -1;
return st;
}


void push(struct stack *a, char a){
struct stack * b = a;
if(b->top==b->)
}

char pop(struct stack *a){

}
