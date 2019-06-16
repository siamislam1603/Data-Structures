
package online;
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
    public void sortedInsert(int data){
        Node n=new Node(data);
        if(head==null || head.data>=n.data){
            n.next=head;
            head=n;
        }
        else{
            Node prev=head,p=head.next;
            while(p!=null && p.data<n.data){
                prev=p;
                p=p.next;
            }
            n.next=prev.next;
            prev.next=n;
        }
        System.out.println(data+" is Inserted");
    }
    public void reverse(){
        Node prev=head,p=head.next,temp=p;
        if(prev==null)
            System.out.println("Empty List");
        else{
            while(p!=null){
                prev.next=p.next;
                p.next=prev;
                prev=p;
                p=p.next;
                temp=p.next;
                if(temp==null){
                    p.next=temp;
                    break;
                }
            } 
        }
    }
    public void display(){
        
        Node l=head;
        System.out.print("List:");
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
