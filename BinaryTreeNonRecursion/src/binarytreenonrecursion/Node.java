package binarytreenonrecursion;
public class Node {
    Node a[]=new Node[50];
    int data,top=-1,arr[]=new int[50],top2=-1;
    Node left,right,root;
    Node(){
        root=null;
    }
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public Node treeInsert(Node root,int z){
        Node n=new Node(z);
        if(root==null){
            root=n;
            left=null;
            right=null;
        }
        else if(z<=root.data){
            root.left=treeInsert(root.left,z);
        }
        else{
            root.right=treeInsert(root.right,z);
        }
        return root;
    }
    public void push(Node n){
        a[++top]=n;
    }
    public Node pop(){
       return a[top--];
    }
    public void push(int n){
        arr[++top2]=n;
    }
    public int pop2(){
        return arr[top2--];
    }
    public void preorder(Node root){
        push(root);
        while(top!=-1){
            Node p=pop();
            if(p!=null){
                System.out.print(p.data+" ");
                push(p.right);
                push(p.left);
            }
        }
    }
    public void inorder(Node root){
        if(root==null) return;
        Node p=root;
        while(p!=null || top!=-1){
            while(p!=null){
                push(p);
                p=p.left;
            }
            p=pop();
            System.out.print(p.data+" ");
            p=p.right;
        }
    }
    public void postorder(Node root){
        push(root);
        while(top!=-1){
            Node p=pop();
            push(p.data);
            if(p.left!=null)
                push(p.left);
            if(p.right!=null)
                push(p.right);
        }
        while(top2!=-1){
            System.out.print(pop2()+" ");
        }
        System.out.println();
    }
}
