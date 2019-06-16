package onilne1;
public class BubbleSorting {
    BubbleSorting(int a[],int k){
        int m=0;
        int len=a.length;
        while(m>=0){
            int t=0;
            for(int i=0;i<len-1;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                t=i;
            }
            m=t;
        }
    }
}
