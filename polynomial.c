#include<stdio.h>
struct poly
{
    int coeff;
    int exp;
}p1[10],p2[10],p3[10];

int readPoly(struct poly p[]);
int addPoly(struct poly p1[],struct poly p2[],int t1,int t2,struct poly p3[]);
void displayPoly(struct poly p[],int t);

void main()
{
    int t1,t2,t3;
    t1=readPoly(p1);
    printf("\nFirst Polynomial:\n");
    displayPoly(p1,t1);

    t2=readPoly(p2);
    printf("\nSecond Polynomial:\n");
    displayPoly(p2,t2);

    t3=addPoly(p1,p2,t1,t2,p3);
    printf("\nResultant Polynomial:\n");
    displayPoly(p3,t3);
}


