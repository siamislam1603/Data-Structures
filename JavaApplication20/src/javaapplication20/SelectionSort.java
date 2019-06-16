package javaapplication20;
public class SelectionSort {
    SelectionSort(int arr[]){
        int compare=0,movement=0;
        long time = 0;
        long start = System.nanoTime();
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                    compare++;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            movement+=3;
        }
        long end = System.nanoTime();
        time += end-start;
        System.out.print("\nSorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nExecution time:"+(time/1000)+" ms");
        System.out.println("Number of data Movement:"+movement);
        System.out.println("Number Of Data comparison:"+compare);
    }
}
