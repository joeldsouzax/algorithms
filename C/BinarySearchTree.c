#include <stdio.h>
#include <stdlib.h>

struct node {
int data;
struct node * left;
struct node * right;
};

int main(){

   struct node * root = malloc(sizeof(struct node));
   struct node * first = malloc(sizeof(struct node));
   struct node * second = malloc(sizeof(struct node));

   /* assigning data to the node */
   root->data = 10;
   first->data = 9;
   second->data=12;
   root->left=first;
   root->right=second;

   first->left=NULL;
   first->right=NULL;

   second->left=NULL;
   second->right=NULL;

   printf("%d\n",root->data);
}
