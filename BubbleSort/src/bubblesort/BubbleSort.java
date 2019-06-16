
package bubblesort;
public class BubbleSort {
    public static void main(String[] args) {
        int a[]={ 4, 7, 3, 1, 5,8,2,6};
        int k=a.length;
        while(k != 0){
            int t=0;
            for(int j=0;j<k-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    t=j;
                }
                
            }
            for(int j=0;j<a.length;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
            k=t;
//            if(k==0){
//                k-=1;
//            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
