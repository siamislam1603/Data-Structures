package binarytree;
public class Node {
    int data;
    Node left,right,root;
    Node(){
        root=null;
    }
    Node(int data){
        this.data=data;
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
    public void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
