package stack;
import java.util.*;
public class Stack {
    static int a[]=new int[3],top=-1,currentItem;
    static void push(int item){
        if(top<a.length-1){
            a[++top]=item;
            System.out.println(a[top]+" IS PUSHED");
        }
        else{
            System.out.println("Stack Overflow");
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(a[top--]+" is poped");
        }
    }
    static void display(){
        if(top!=-1){
            System.out.print("Current Stack Elements:");
            for(int j=0;j<=top;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Empty Stack");
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
