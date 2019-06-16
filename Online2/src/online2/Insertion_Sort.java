package online2;
public class Insertion_Sort {
    Insertion_Sort(int arr[]){
       for(int j=1;j<arr.length;j++){
            int temp=arr[j];
            int i=j-1;
            while (i>=0 && arr[i] > temp)
            {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = temp;
        }
        
    }
}
