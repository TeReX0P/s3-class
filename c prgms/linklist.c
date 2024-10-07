#include<stdio.h>
#include<stdlib.h>
int data,link;
struct node
{
    int data;
    struct node *link;
};
struct node *head=NULL;
void insert(int data)
{
    struct node *ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->link=head;
    head=ptr;
}
void display()
{
    struct node *ptr;
    ptr=head;
    while(ptr!=NULL)
    {
        printf("%d\n",ptr->data);
        ptr=ptr->link;
    }
}
void main()
{
    int n;
    printf("Enter the size\n");
    scanf("%d",&n);
    printf("Enter the data\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&data);
        insert(data);
    }
    display();

}