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

/* main method as a client that will create and use the list*/

int main(){
struct node * head = create(10); /* create head node and pass data 10*/
printf("%d",head->data);
return 0;
}

/* node creation function */

struct node * create(int x){
    struct node * head = malloc(sizeof(struct node)); /* create a memory allocation of struct node size and assign it to the head */
    head->data = x; /* put x in the node data */
    head->next = NULL; /* pointing to a null location indicating the end*/
    
    return head;
}
