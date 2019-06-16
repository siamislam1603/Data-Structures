package assignment;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        Student_list s[]=new Student_list[5];
        System.out.println("Enter id ,name,contact_number,cgpa");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
          s[i]=new Student_list(sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());  
        }
        ArrayList<Student_list> mylist=new ArrayList<Student_list>();
        for(int i=0;i<5;i++){
       mylist.add(s[i]); 
        }
        sort(s);
        
        
    }
    public static void sort(Student_list s[]){
        int temp;
        for(int i=4;i>=0;i--){
           for(int j=0;j<i;j++){
               if(s[j].id>s[j+1].id){
                   temp=s[j+1].id;
                   s[j+1].id=s[j].id;
                   s[j].id=temp;
               }
           }
       }
        for(int i=0;i<5;i++){
            System.out.println(s[i].id+" "+s[i].name+""+s[i].Contact_no+" "+s[i].cgpa);
        }
    }
}
