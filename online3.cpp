#include<bits/stdc++.h>
#include<stdlib.h>
int a[1000];
int qSMovement=0,mSMovement=0;
int qSCompare=0,mid,c=0,n;
void Quicksort(int f,int l){
    int i,j,temp,k;
    if(c==0 && f<l){
        i=f+1;
        j=l;
        while(a[i]<a[f]){
            i++;
            qSCompare++;
        }
        qSCompare++;
        while(a[j]>a[f]){
            j--;
            qSCompare++;
        }
        qSCompare++;
        while(i<j){
            qSCompare++;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
            qSMovement+=3;
            while(a[i]<a[f]){
               i++;
               qSCompare++;
            }
            qSCompare++;
            while(a[j]>a[f]){
               j--;
               qSCompare++;
            }
            qSCompare++;
        }
        qSCompare++;
        temp=a[j];
        a[j]=a[f];
        a[f]=temp;
        qSMovement+=3;
        if(j==mid){
            printf("\nMid:%d\n",a[j]);
            if(n%2==0){
                c=0;
                mid++;
            }
            else{
                c=1;
            }
        }
        else if(c==0 &&j!=mid){
            if(j>mid){
                Quicksort(f,j-1);
            }
            else if(j<mid){
                Quicksort(j+1,l);
            }
        }
    }
}

int main(){
    int d,r;
    clock_t start1,end1,start2,end2;
    printf("Array Size:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        a[i]=1+rand()%100;
    }
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    if(n%2!=0){
        d=n/2;
        mid=d;
    }
    else{
        d=n/2;
        mid=d-1;
    }
    start1=clock();
    Quicksort(0,n-1);
    end1=clock();
    double qSTime=(double)(end1-start1)/CLOCKS_PER_SEC;
    printf("mid:%d\n",a[mid]);
}
