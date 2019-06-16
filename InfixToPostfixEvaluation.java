package infixtopostfixevaluation;

import java.util.Scanner;

public class InfixToPostfixEvaluation {
    static int a[]=new int[500];
    static int top=-1; 
    static int val1=0,val2=0;
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
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c))
                push(c-'0');
            else{
                if(c==' '){
                    for(int j=1;top!=-1;j=j*10){
                        val2=val2+j*a[top];
                        pop();
                    }
                }
                else{
                    for(int j=1;top!=-1;j=j*10){
                        val1=val1+j*a[top];
                        pop();
                    }
                    switch(c){
                    case '+':
                        push(val1+val2);
                        val1=0;
                        val2=0;
                                
                        break;
                    case '-':
                        push(val2-val1);
                        val1=0;
                        val2=0;
                        break;
                    case '*':
                        push(val1*val2);
                        val1=0;
                        val2=0;
                        break;
                    case '/':
                        push(val2/val1);
                        val1=0;
                        val2=0;
                        break;
                       
                }
                }
                
            }
        }
        System.out.println(a[top]);
    }
    
}
