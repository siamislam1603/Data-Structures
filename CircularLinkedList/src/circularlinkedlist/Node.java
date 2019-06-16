package circularlinkedlist;
public class Node {
    Node head,next;
    int data;
    Node(){
        head=null;
    }
    Node(int data){
        this.data=data;
    }
    public void sortedInsert(int data){
        Node n=new Node(data);
        Node last=head;
        if(head==null){
            n.next=n;
            head=n;
        }
        else if(head.data>=n.data){
            while(last.next!=head)
                last=last.next;
            last.next=n;
            n.next=head;
            head=n;
        }
        else{
            while(last.next!=head && last.next.data<n.data){
                last=last.next;
            }
            n.next=last.next;
            last.next=n;
        }
        System.out.println(data+" is Inserted");
    }
    public void delete(int data){
        Node p=head,prev=p;
        if(p==null)
            System.out.println("Empty List");
        else{
            Node last=head;
            int count=0;
            if(p.data==data){
                while(last.next!=head){
                    last=last.next;
                    count++;
                }
                if(count==0){
                    head=null;
                }
                else{
                    head=p.next;
                    last.next=head;
                }
                System.out.println(data+" is Deleted from list");
            }
            else{
                p=p.next;
                while(p!=head && p.data!=data){
                    prev=p;
                    p=p.next;
                }
                if(p!=head || prev.next.data==data){
                    System.out.println(data+" is Deleted from list");
                    prev.next=p.next;
                }
                else{
                    System.out.println("Not found in the list");
                }
                
            }
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
