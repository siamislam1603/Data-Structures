
package queuestack;
public class Node {
    Node head;
    int data;
    Node next;
    Node(){
        head=null;
    }
    Node(int data){
        this.data=data;
    }
    public void push(int data){
        Node n=new Node(data);
        if(head==null){
            n.next=head;
            head=n;
        }
        else{
            Node prev=head,p=head.next;
            while(p!=null){
                prev=p;
                p=p.next;
            }
            n.next=prev.next;
            prev.next=n;
        }
        System.out.println(data+" is Pushed");
    }
    public void pop(){
        Node p=head,prev=null;
        if(p==null)
            System.out.println("Empty Queue");
        else{
            System.out.println(head.data+" is Poped");
            head=p.next;
        }
    }
    public void display(){
        
        Node l=head;
        System.out.print("Queue:");
        if(l==null){
            System.out.print("Empty");
        }
        while(l!=null){
            System.out.print(l.data+" ");
            l = l.next;
        }
        System.out.println();
    }
}
