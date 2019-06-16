
package circularlinkedliststack;
public class Node {
    Node head,next;
    int data;
    Node(){
        head=null;
    }
    Node(int data){
        this.data=data;
    }
    public void push(int data){
        Node n=new Node(data);
        Node last=head;
        if(head==null){
            n.next=n;
            head=n;
        }
        else{
            while(last.next!=head){
                last=last.next;
            }
            n.next=last.next;
            last.next=n;
        }
        System.out.println(data+" is Pushed");
    }
    public void pop(){
        Node p=head,prev=null;
        if(p==null)
            System.out.println("Empty Stack");
        else{
            while(p.next!=head){
                prev=p;
                p=p.next;
            }
            System.out.println(p.data+" is Poped");
            if(prev!=null)
                prev.next=head;
            else
                head=null;
        }
    }
    public void display(){
        if(head!=null){
            Node temp=head;
            System.out.print(temp.data+" ");
            while(temp.next!=head){
                temp=temp.next;
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Empty List");
        }
    }
}

