#include<bits/stdc++.h>
#include<stdlib.h>
int a[1000];
int b[1000];
int qSMovement=0,mSMovement=0;
int qSCompare=0,mSCompare=0;
void Quicksort(int f,int l){
    int i,j,temp,k;
    if(f<l){
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
        Quicksort(f,j-1);
        Quicksort(j+1,l);
    }
}

void Merge(int b[],int p,int q,int r){
    int n1=q-p+1;
    int n2=r-q;
    int L[n1+1],R[n2+1];
    for(int i=0;i<n1;i++){
        L[i]=b[p+i];
        mSMovement++;
    }
    for(int j=0;j<n2;j++){
        R[j]=b[q+1+j];
        mSMovement++;
    }
    L[n1]=INT_MAX;
    R[n2]=INT_MAX;
    int i=0,j=0;
    for(int k=p;k<=r;k++){
        mSCompare++;
        if(L[i]<=R[j]){
            b[k]=L[i++];
            mSMovement++;
        }
        else{
            b[k]=R[j++];
            mSMovement++;
        }
    }
}
void MergeSort(int b[],int p,int r){
    if(p<r){
        int q=(p+r)/2;
        MergeSort(b,p,q);
        MergeSort(b,q+1,r);
        Merge(b,p,q,r);
    }
}
int main(){
    int n;
    clock_t start1,end1,start2,end2;
    printf("Array Size:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        a[i]=1+rand()%100;
    }
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
        b[i]=a[i];
    }
    start1=clock();
    Quicksort(0,n-1);
    end1=clock();
    double qSTime=(double)(end1-start1)/CLOCKS_PER_SEC;
    printf("\n\nSorted Array after Quick Sort: ");
    for(int k=0;k<n;k++){
        printf("%d ",a[k]);
    }
    printf("\n\n");
    start2=clock();
    MergeSort(b,0,n-1);
    end2=clock();
    double mSTime=(double)(end2-start2)/CLOCKS_PER_SEC;
    printf("\n\nSorted Array after Merge sort: ");
    for(int k=0;k<n;k++){
        printf("%d ",b[k]);
    }
    printf("\n\nSorting \tMovement\tComparisons\tExecution Time....");
    printf("\nQuick Sort\t%d\t\t%d\t\t%lf",qSMovement,qSCompare,qSTime);
    printf("\nMerge Sort\t%d\t\t%d\t\t%lf\n",mSMovement,mSCompare,mSTime);
}

