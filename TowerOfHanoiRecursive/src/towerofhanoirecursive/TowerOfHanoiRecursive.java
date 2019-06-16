
package towerofhanoirecursive;

import java.util.Scanner;

public class TowerOfHanoiRecursive {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number Of Disks:");
        int n=in.nextInt();
        Hanoi(n,1,3,2);
    }
    static void Hanoi(int n,int source,int destination,int aux){
        if(n==1){
            System.out.println("Move disk 1 from pole "+source+" to rod "+destination);
            return;
        }
        else{
            Hanoi(n-1,source,aux,destination);
            System.out.println("Move disk "+n+" from pole "+source+" to "+destination);
            Hanoi(n-1,aux,destination,source);
        }
    }
    
}
