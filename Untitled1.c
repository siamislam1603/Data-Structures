#include<bits/stdc++.h>
#include<stdlib.h>
int  A[1000];
int C[1000];
void Quicksort(int f,int l){
    int i,j,temp,k;
    if(f<l){
        i=f+1;
        j=l;
        while(A[f]>A[i]){
            i++;
        }
        while(A[f]<A[j]){
            j--;
        }
        while(j>i){
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;j--;
            while(A[f]>A[i]){
               i++;
            }
            while(A[f]<A[j]){
               j--;
            }
        }
        temp=A[j];
        A[j]=A[f];
        A[f]=temp;
        Quicksort(f,j-1);
        Quicksort(j+1,l);
    }
}

void Merge(int A[],int p,int q,int r){
    int length1=q-p+1;
    int length2=r-q;
    int L[length1+1];
    int R[length2+1];
    for(int i=0;i<length1;i++){
        L[i]=A[p+i];
    }
        for(int j=0;j<length2;j++){
        R[j]=A[q+1+j];
    }
    L[length1]=102;
    R[length2]=102;
    int i=0,j=0;
    for(int k=p;k<=r;k++){
        if(L[i]<=R[j]){
            A[k]=L[i];
            i++;
        }
        else{
            A[k]=R[j];
            j++;
        }
    }
}
void Mergesort(int A[],int p,int r){
    int q;
   if(p<r){
     q=(p+r)*.5;
     Mergesort(A,p,q);
     Mergesort(A,q+1,r);
     Merge(A,p,q,r);
   }
}
int main(){
    int size;
    printf("Enter the size of the array=");
    scanf("%d",&size);
    for(int i=0;i<size;i++){
        A[i]=1+rand()%100;
    }
    for(int i=0;i<size;i++){
        printf("%d  ",A[i]);
    }
    for(int i=0;i<size;i++){
     C[i]=A[i];
    }
    Quicksort(0,size-1);
    printf("\nAfter Quick sort");
    for(int k=0;k<size;k++){
        printf("%d   ",A[k]);
    }
    Mergesort(C,0,size);
    printf("\nAfter Merge sort");
    for(int k=0;k<size;k++){
        printf("%d   ",C[k]);
    }
}
