package online2;
import java.util.*;
public class Online2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("How many numbers to take as inputs?:");
        int n=in.nextInt();
        System.out.print("Where to start?:");
        int m=in.nextInt();
        Random random = new Random();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(n-10) + m;
        }
        System.out.println("\nUnsorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        Insertion_Sort insert=new Insertion_Sort(a);
        System.out.print("\nSorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nItem:");
        int item=in.nextInt();
        Binary_Search bs=new Binary_Search(a,item);
    }
    
}
