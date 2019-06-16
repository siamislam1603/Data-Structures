
package doubleylinkedlist;
import java.util.*;
public class DoubleyLinkedList {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Node createNode=new Node();
        int num,choice,a;
        while(true){
            System.out.print("Enter 1 for Insert,2 for Delete,3 for Display,4 for Exit:");
            choice=in.nextInt();
            switch(choice){
                case 1:System.out.print("Enter Item to be inserted:");
                    a=in.nextInt();
                    createNode.sortedInsert(a);
                    break;
                case 2:System.out.print("Enter item to be deleted:");
                    a=in.nextInt();
                    createNode.delete(a);
                    break;
                case 3:createNode.display();
                    break;
                case 4:return;
                default:System.out.println("Invalid choice");
                break;
            }
        }
    }
    
}
