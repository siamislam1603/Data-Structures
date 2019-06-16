
package doubleylinkedliststack;
public class Node {
    Node head,previous,next;
    int data;
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
            n.previous=null;
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
            n.previous=prev;
        }
        System.out.println(data+" is Pushed");
    }
    public void pop(){
        Node p=head,prev=null;
        if(p==null)
            System.out.println("Empty Stack");
        else{
            while(p.next!=null){
                prev=p;
                p=p.next;
            }
            System.out.println(p.data+" is Poped");
            if(prev==null)
                head=null;
            else
                prev.next=null;
        }
    }
    public void display(){
        Node l=head;
        if(l==null){
            System.out.print("Empty Stack");
        }
        while(l!=null){
            System.out.print(l.data+" ");
            l = l.next;
        }
        System.out.println();
    }
}
