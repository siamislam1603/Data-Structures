
package javaapplication20;

public class InsertionSort {
    InsertionSort(int arr[]){
        int compare=0,movement=0;
        long time = 0;
        long start = System.nanoTime();
        for(int j=1;j<arr.length;j++){
            int temp=arr[j];
            movement++;
            int i=j-1;
            compare++;
            while (i>=0 && arr[i] > temp)
            {
                arr[i+1] = arr[i];
                i = i-1;
                compare++;
                movement++;
            }
            arr[i+1] = temp;
            movement++;
        }
        long end = System.nanoTime();
        time += end-start;
        System.out.print("\nSorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nExecution time:"+(time/1000)+" ms");
        System.out.println("Number of data comparison:"+compare);
        System.out.println("Nummber of data movement:"+movement);
    }
}
