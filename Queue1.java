package queue1;

import java.util.Scanner;

public class Queue1 {
    static int count=0,start=0;
    public static void main(String[] args) {
        int size;
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        size=sc.nextInt();
        int arr[]=new int[size];
        while(i==0){
            System.out.println();
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int input=sc.nextInt();
            switch(input){
                case 1:push(arr,size);
                       break;
                case 2:pop(arr);
                        break;
                case 3:display(arr);
                      break;
                case 4:i=1;
                      break;
            }
        }
    }
    private static void push(int[] arr,int size) {   
        Scanner sc=new Scanner(System.in);
        if(count<size){
            System.out.println("Enter element::");
            arr[count]=sc.nextInt();
            count++;
        }
        else{
            System.out.println("Queue overflow");
        }
    }
    private static void pop(int[] arr) {
        if(start<count){
            System.out.println("  "+arr[start]);
            start++;
        }else if(start==count){
            System.out.println("Empty queue");   
        }
    }
    private static void display(int[] arr) {
        for(int i=start;i<count;i++){
            System.out.print("   "+arr[i]);
        }
    }
}
