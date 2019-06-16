package offline2;
public class QuickSort {
    static int qSMovement=0,qSCompare=0;
    void quickSort(int a[],int f,int l){
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
            quickSort(a,f,j-1);
            quickSort(a,j+1,l);
        }
    }
}
