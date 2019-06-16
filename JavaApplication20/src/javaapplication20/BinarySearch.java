
package javaapplication20;
public class BinarySearch {
    BinarySearch(int arr[],int it){
        int low=0,high=arr.length-1,count=0,compare=0;
        long time=0;
        long start=System.nanoTime();
        while(low<=high){
            int mid=(low+high)/2;
            if(it==arr[mid]){
                System.out.println("Item found at index "+mid);
                count=0;
                compare++;
                break;
            }
            else if(it<arr[mid]){
                high=mid-1;
                count=1;
                compare++;
            }
            else if(it>arr[mid]){
                low=mid+1;
                count=1;
                compare++;
            }  
        }
        long end=System.nanoTime();
        time+=end-start;
        if(count==1){
            System.out.println("Item not found");
        }
        System.out.println("Number of data comparison:"+compare);
        System.out.println("Execution Time:"+(time/1000)+" ms");
    }
}
