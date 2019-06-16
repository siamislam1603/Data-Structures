package offline2;
import java.util.*;
public class Offline2 {
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter how many numbers to take as input?:");
        int n=in.nextInt();
        System.out.print("Where to start input?");
        int m=in.nextInt();
        int a[]=new int[1000];
        int b[]=new int[1000];
        Random random=new Random();
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(n) + m;
        }
        System.out.print("Unsorted Array is:");
        for(int k=0;k<n;k++){
            System.out.print(a[k] + " " );
            b[k]=a[k];
        }
        QuickSort q=new QuickSort();
        long time1=0;
        long start1=System.nanoTime();
        q.quickSort(a, 0, n-1);
        long end1=System.nanoTime();
        time1+=end1-start1;
        System.out.print(" \nThe sorted array is: ");
        for(int j=0;j<n;j++){
            System.out.print(a[j] + " ");
        }
        MergeSort c=new MergeSort();
        System.out.print("\nUnsorted Array is:");
        for(int k=0;k<n;k++){
            System.out.print(b[k] + " ");
        }
        long time2=0;
        long start2=System.nanoTime();
        c.mergeSort(b, 0, n-1);
        long end2=System.nanoTime();
        time2+=end2-start2;
        System.out.print("\nThe sorted array is:");
        for(int j=0;j<n;j++){
            System.out.print(b[j] + " ");
        }
        System.out.println();
        System.out.println("Sorting\t\tComparison\tMovement\tExecution Time...");
        System.out.println("Quick Sort\t"+q.qSCompare+"\t\t"+q.qSMovement+"\t\t"+(time1/1000)+" ms");
        System.out.println("Merge Sort\t"+c.mSCompare+"\t\t"+c.mSMovement+"\t\t"+(time2/1000)+" ms");
    }
    
}
