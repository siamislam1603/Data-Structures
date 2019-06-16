
package queuestack;

import java.util.*;


public class QueueStack {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Node createNode=new Node();
        int num,choice,a;
        while(true){
            System.out.print("Enter 1 for Push,2 for Pop,3 for Display,4 for Exit:");
            choice=in.nextInt();
            switch(choice){
                case 1:System.out.print("Enter Item to be inserted:");
                    a=in.nextInt();
                    createNode.push(a);
                    break;
                case 2:createNode.pop();
                    break;
                    
                case 3:createNode.display();
                    break;
                case 4:return;
            }
        }
    }
    
}
