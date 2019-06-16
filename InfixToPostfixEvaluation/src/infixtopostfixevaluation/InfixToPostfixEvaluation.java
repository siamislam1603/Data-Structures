package infixtopostfixevaluation;

import java.util.Scanner;

public class InfixToPostfixEvaluation {
    static int a[]=new int[500];
    static int top=-1; 
    static void push(int item){
        if(top<a.length-1){
            a[++top]=item;
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Postfix Expression:");
        s=in.nextLine();
        postfix(s);
    }
    static void postfix(String s){
        int result;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c))
                push(c-'0');
            else{
                int val2=a[top];
                pop();
                int val1=a[top];
                pop();
                switch(c){
                    case '+':
                        push(val1+val2);
                        break;
                    case '-':
                        push(val1-val2);
                        break;
                    case '*':
                        push(val1*val2);
                        break;
                    case '/':
                        push(val1/val2);
                        break;
                }
            }
        }
        System.out.println(a[top]);
    }
    
}
