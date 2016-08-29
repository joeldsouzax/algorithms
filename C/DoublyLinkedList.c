#include <stdio.h>
#include <stdlib.h>

struct node{
int data;
struct node * next;
struct node * previous;
};

struct node * create(int);

int main(){
 struct node * head = create(10);
 printf("this is head data %d\n",head->data);
 return 0;
}

struct node * create(int a){
struct node * head = malloc(sizeof(struct node));
head->data = a;
head->previous = NULL;
head->next = NULL;

return head;
}
