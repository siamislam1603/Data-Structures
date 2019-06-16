package onilne1;
import java.util.*;
public class Onilne1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("How many numbers to take as inputs?:");
        int n=in.nextInt();
        System.out.print("Where to start?:");
        int m=in.nextInt();
        Random random = new Random();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=random.nextInt(n-10) + m;
        }
        System.out.println("\nUnsorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        int l=in.nextInt();
        BubbleSorting bubble=new BubbleSorting(b,l);
    }
    
}
