#include<stdio.h>
void main(){
    int i ,a ,n;
    printf("Enter the number :\n");
    scanf("%d",&n);
    for(i=1; i<=10; i++){
        a=n*i;
        printf("%d * %d = %d\n",n,i,a);
    }


 
}