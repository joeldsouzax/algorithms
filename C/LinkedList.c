/* author: joel D'Souza */
/* studying linked list */
#include <stdio.h>
#include <stdlib.h>

/* node structure */
struct node {
int data; /* variable to store data in a node*/
struct node * next; /* pointer variable to store memory location of next node*/
};

struct node * create(int); /* function declaration to create a node */
void push(struct node **, int); /* function to push a node on the head of the linked list*/
int len(struct node *); /* count the number of nodes in a linked list*/
void append(struct node **, int); /* appending the node at the end of the list */

/* main method as a client that will create and use the list*/

int main(){
struct node * head = create(10); /* create head node and pass data 10*/
printf("%d\n",head->data);
push(&head, 12);
printf("%d\n",head->data);
push(&head, 17);
printf("%d\n",head->data);
printf("%d the length \n",len(head));
append(&head,19);
printf("%d the length \n",len(head));
return 0;
}

/* node creation function */

struct node * create(int x){
    struct node * head = malloc(sizeof(struct node)); /* create a memory allocation of struct node size and assign it to the head */
    head->data = x; /* put x in the node data */
    head->next = NULL; /* pointing to a null location indicating the end*/
    
    return head;
}

void push(struct node ** headref, int x){
 struct node * new = malloc(sizeof(struct node)); /* creating a memory for the node*/
 new->data = x;
 new->next= *headref; /* pass the value of the next in the memory allocation of head*/
 *headref = new; 
}

/*share the head pointer*/
int len(struct node * head){
struct node * current = head; /*copy the head pointer to another one to itirate over and get the count*/
int count = 0;
while(current != NULL){
current = current->next;
count++;
}
return count;
}

void append(struct node ** headref, int x){
        struct node * new = malloc(sizeof(struct node));
        struct node * current = *headref;

        new->data = x;
        new->next = NULL;

        if(current==NULL){
        *headref = new;
        }else{
        while(current->next !=NULL){
        current = current->next;}

        current->next=new;

        }
}


