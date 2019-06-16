
package online2;
public class Binary_Search {
    Binary_Search(int arr[],int it){
        int low=0,high=arr.length-1,count=0,temp=0,mid1=0;
        while(low<high){
            int mid=(low+high)/2;
            if(it==arr[mid]){
                count++;
                temp=mid;
                mid++;
                mid1=temp-1;
                while(it==arr[mid]){
                    count++;
                    mid++;
                }
                while(it==arr[mid1] && mid1>=0){
                    count++;
                    mid1--;
                }
                break;
            }
            else if(it<arr[mid]){
                high=mid-1;
            }
            else if(it>arr[mid]){
                low=mid+1;
            }  
        }
        System.out.println("Number Of Occurence:"+count);
    }
}
