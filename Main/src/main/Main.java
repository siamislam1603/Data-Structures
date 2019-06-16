
package main;
//import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class Main
{
    public static void main(String[] args) 
    {
        Tree t = new Tree();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);

        t.postorder(t.node);
        System.out.println();

        t.iterative(t.node);
        System.out.println();
    }
}
