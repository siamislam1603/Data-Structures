package towerofhanoi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number Of Disks:");
        int n=in.nextInt();
        Hanoi(n,'A','D','B','C');
    }
    static void Hanoi(int n,char source,char destination,char aux1,char aux2){
        if(n==0){
            return;
        }
        else if(n==1){
            System.out.println("Move disk 1 from pole "+source+" to "+destination);
            return;
        }
        else{
            Hanoi(n-2,source,aux1,aux2,destination);
            System.out.println("Move disk "+(n-1)+" from pole "+source+" to "+aux2);
            System.out.println("Move disk "+n+" from pole "+source+" to "+destination);
            System.out.println("Move disk "+(n-1)+" from pole "+aux2+" to "+destination);
            
            Hanoi(n-2,aux1,destination,source,aux2);
            
        }
    }
    
}
