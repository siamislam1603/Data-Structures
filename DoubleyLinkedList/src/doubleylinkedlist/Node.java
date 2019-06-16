package doubleylinkedlist;
public class Node {
    Node head,previous,next;
    int data;
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
            n.previous=null;
            if(head!=null)
                head.previous=n;
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
            n.previous=prev;
        }
        System.out.println(data+" is Inserted");
    }
    public void delete(int data){
        Node p=head,prev=null;
        if(p==null)
            System.out.println("Empty List");
        else{
            if(p.data==data){
                head=p.next;
                System.out.println(data+" is Deleted from list");
            }
            else{
                while(p!=null && p.data!=data){
                    prev=p;
                    p=p.next;
                }
                if(p!=null || prev.data==data){
                    System.out.println(data+" is Deleted from list");
                    prev.next=p.next;
                    p.next.previous=prev;
                }
                else{
                    System.out.println("Not found in the list");
                }
                
            }
        }
    }
    public void display(){
        Node temp=head,tail=null;
        System.out.print("Forward traverse:"+temp.previous+" <- ");
        while(temp!=null){ 
            System.out.print(temp.data+ " <=> ");
            tail=temp;
            temp=temp.next;
        }
        System.out.println(temp);
        System.out.print("Backward traverse:"+tail.next+" <- ");
        while(tail!=null){
            System.out.print(tail.data+ " <=> ");
            tail=tail.previous;
        }
        System.out.println(tail);
    }
}
