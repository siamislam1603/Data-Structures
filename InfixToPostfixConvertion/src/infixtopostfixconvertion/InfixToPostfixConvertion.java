
package infixtopostfixconvertion;
import java.util.*;
public class InfixToPostfixConvertion {
    static char a[]=new char[500];
    static int top=-1; 
    static void push(char item){
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
        System.out.print("Enter Infix Expression:");
        s=in.nextLine();
        postfix(s);
    }
    static void postfix(String s){
        push('#');
        String postfix="";
        while(top!=-1){
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    postfix+=c;
                    if(i==s.length()-1){
                        while(top!=0){
                            postfix+=a[top];
                            pop();
                        }
                    }
                }
                else if(c=='(')
                    push(c);
                else if(c==')')
                {
                    while(a[top]!='('){
                        postfix+=a[top];
                        pop();
                    }
                    if(a[top]=='(')
                        pop();
                    if(i==s.length()-1){
                        while(top!=0){
                            postfix+=a[top];
                            pop();
                        }
                    }
                }
                else{
                    if(a[top]=='+'||a[top]=='-'||a[top]=='*'||a[top]=='/'||a[top]=='^'){
                        postfix+=a[top];
                        pop();
                        push(c);
                    }
                    
                    else{
                        push(c);
                    }
                }
            }
            top--;
        }
        System.out.println(postfix);
    }
    
}
