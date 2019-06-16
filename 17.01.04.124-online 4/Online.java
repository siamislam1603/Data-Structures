
package online;
import java.util.*;
public class Online {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Node createNode=new Node();
        int num,choice,a;
        while(true){
            System.out.print("Enter 1 for Insert,2 for Reverse,3 for Display,4 for Exit:");
            choice=in.nextInt();
            switch(choice){
                case 1:System.out.print("Enter Item to be inserted:");
                    a=in.nextInt();
                    createNode.sortedInsert(a);
                    break;
                case 2:
                    createNode.reverse();
                    break;
                case 3:createNode.display();
                    break;
                case 4:return;
            }
        }
    }
    
}
