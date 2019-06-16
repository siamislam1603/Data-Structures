
package main;

import java.util.Stack;

class Tree
{
    int a[]=new int[50],front=0,rear=a.length-1,size=0;
    Node node;
    public void insert(int data)
    {
        if(node == null)
            node = new Node(null,data,null);
        else
        {
            push(node.data);
            while(size!=0)
            {
                Node temp = pop();
                if(temp.left == null)
                {
                    temp.left = new Node(null,data,null);
                    break;
                }
                else
                {
                    q.add(temp.left);
                }

                if(temp.right == null)
                {
                    temp.right = new Node(null,data,null);
                    break;
                }
                else
                {
                    q.add(temp.right);
                }
            }
        }
    }
    public void push(int data){
        rear=(rear+1)%a.length;
        a[rear]=data;
        size++;
    }
    public void pop(){
        front=(front+1)%a.length;
        size--;
    }
    public void postorder(Node node)
    {
        if(node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        //System.out.print(node.getData()+" --> ");
    }

    public void iterative(Node node)
    {
        Stack<Node> s = new Stack<Node>();
        while(true)
        {
            while(node != null)
            {
                s.push(node);
                node = node.left;
            }
            if(s.peek().right == null)
            {
                node = s.pop();
                //System.out.print(node.getData()+" --> ");
                if(node == s.peek().right)
                {
                    //System.out.print(s.peek().getData()+" --> ");
                    s.pop();
                }
            }

            if(s.isEmpty())
                break;

            if(s.peek() != null)
            {
                node = s.peek().right;
            }
            else
            {
                node = null;
            }
        }
    }
}
