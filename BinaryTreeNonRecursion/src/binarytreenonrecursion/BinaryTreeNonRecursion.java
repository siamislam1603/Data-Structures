package binarytreenonrecursion;

import java.util.*;

public class BinaryTreeNonRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter no of vertex:");
        int a=in.nextInt();
        Node n=new Node();
        Node root=null;
        System.out.println("Enter vertices:");
        for(int i=a;i>=1;i--){
            root=n.treeInsert(root,in.nextInt());
        }
        System.out.println("Preorder:");
        n.preorder(root);
        System.out.println("\nInorder:");
        n.inorder(root);
        System.out.println("\nPostorder:");
        n.postorder(root);
    }
    
}
