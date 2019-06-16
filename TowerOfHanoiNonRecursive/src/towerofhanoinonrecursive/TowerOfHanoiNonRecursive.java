package towerofhanoinonrecursive;

import java.util.Scanner;

public class TowerOfHanoiNonRecursive {
    static int top=-1;
    static Hanoi a[]=new Hanoi[200];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of disks:");
        int n=in.nextInt();
        Hanoi h=new Hanoi(n,1,2,3);
        push(h);
        while(top!=-1){
            pop();
            Hanoi x=a[top+1];
            if(x.n==1){
                System.out.println("Move disk from pole "+x.source+" to "+x.destination);
            }
            else{
                Hanoi h2=new Hanoi(x.n-1,x.aux,x.source,x.destination);
                push(h2);
                Hanoi h3=new Hanoi(1,x.source,x.aux,x.destination);
                push(h3);
                Hanoi h4=new Hanoi(x.n-1,x.source,x.destination,x.aux);
                push(h4);
            }
        }
    }
    static void push(Hanoi h){
        a[++top]=h;
    }
    static void pop(){
        top=top-1;
    }
    
}
