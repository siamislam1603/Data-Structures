package main;
public class Node
{
    Node left;
    int data;
    Node right;

    Node(Node left, int data, Node right)
    {
        this.left = left;
        this.right = right;
        this.data = data;
    }
//
//    public String getData()
//    {
//        return data;
//    }
}
