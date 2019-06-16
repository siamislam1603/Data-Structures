package offline2;
public class MergeSort {
    static int mSMovement=0; 
    static int mSCompare=0;
    void mergeSort(int arr[],int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            Merge(arr,p,q,r);
        }
    }
    void Merge(int b[],int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;
        int L[]=new int[n1+1],R[]=new int[n2+1];
        for(int i=0;i<n1;i++){
            L[i]=b[p+i];
            mSMovement++;
        }
        for(int j=0;j<n2;j++){
            R[j]=b[q+1+j];
            mSMovement++;
        }
        L[n1]=32768;
        R[n2]=32768;
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
}
