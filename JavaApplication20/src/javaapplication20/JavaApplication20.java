
package javaapplication20;
import java.util.*;

public class JavaApplication20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("How many numbers to take as inputs?:");
        int n=in.nextInt();
        System.out.print("Where to start?:");
        int m=in.nextInt();
        Random random = new Random();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(n) + m;
            b[i]=a[i];
        }
        System.out.println("\nUnsorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\n\n\"Insertion Sort\":");
        InsertionSort insert=new InsertionSort(b);
        System.out.println("\n\"Selection Sort\":");
        SelectionSort selection=new SelectionSort(a);
        System.out.println("\nEnter item to be searched:");
        int item=in.nextInt();
        BinarySearch binary=new BinarySearch(a,item);
        
    }
    
}
