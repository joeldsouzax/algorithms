#include <stdio.h>
#include <stdlib.h>

struct node{
int data;
struct node * next;
struct node * previous;
};

struct node * create(int);
void push(struct node **,int);
int length(struct node *);

int main(){
 struct node * head = create(10);
 printf("this is head data %d\n",head->data);
 push(&head,12);
 printf("this is the head data %d\n",head->data);
 printf("length %d\n",length(head));
 return 0;
}

struct node * create(int a){
struct node * head = malloc(sizeof(struct node));
head->data = a;
head->previous = NULL;
head->next = NULL;

return head;
}

void push(struct node ** headref,int a){
struct node * new = malloc(sizeof(struct node));
struct node * dummy = *headref;
new->data = a;
new->next = *headref;
new->previous = NULL;
dummy->previous = new;
*headref = new;
}

int length(struct node * head){
struct node * current = head;
int count = 0;
while(current != NULL){
current = current->next;
count++;
}
return count;
}
