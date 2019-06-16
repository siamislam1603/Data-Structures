
package javaapplication9;

import java.util.Scanner;
public class JavaApplication9 {
    static int i=0;
    static disk stack[]=new disk[100];
    public static void main(String[] args) {System.out.println("Enter number of disks");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();disk x=new disk(n,1,2,3);
        push(x);
        while(i!=0){
        pop();
        }
    }
    private static void push(disk x) {
        stack[i]=x;
        i++;
    }
    private static void pop() {
        disk y=stack[i-1];
        i--;
        if(y.n==1){
            System.out.println("From "+y.i+"to "+y.k);
        }
        else{
            disk z=new disk(y.n-1,y.j,y.i,y.k);
            push(z);
            disk a=new disk(1,y.i,y.j,y.k);
            push(a);
            disk c=new disk(y.n-1,y.i,y.k,y.j);
            push(c);
        }
    }
}
class disk {
    int n;
    int i;
    int j;
    int k;
    disk(int n,int a,int b,int c){
        this.n=n;
        i=a;
        j=b;
        k=c;
    }
}
