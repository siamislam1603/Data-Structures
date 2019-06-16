package queue;
import java.util.*;
public class Queue {
    static int a[]=new int[10],front=0,rear=a.length-1,size=0;
    static void push(int item){
        if(size==a.length){
            System.out.println("Queue Overflow");
        }
        else{
            rear=(rear+1)%a.length;
            a[rear]=item;
            size++;
            System.out.println(a[rear]+" is pushed");
        }
    }
    static void pop(){
        if(size==0){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println(a[front]+" is poped");
            front=(front+1)%a.length;
            size--;
        }
    }
    static void display(){
        if(size!=0){
            for(int i=front;i<=rear;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Empty Queue");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice,item;
        while(true){
            System.out.print("Enter 1 for push,2 for pop,3 for display,4 for Exit:");
            choice=in.nextInt();
            switch(choice){
                case 1:System.out.print("Enter item:");
                item=in.nextInt();
                push(item);
                break;
                case 2:pop();
                break;
                case 3:display();
                break;
                case 4:return ;
            }
        }
    }
    
}
