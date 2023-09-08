package sortingAlgorithms;

//Time Complexity in worst case = O(n^2)   --> worst case occurs when pivot is always the smallest or the largest element
//Time Complexity in averge case = O(nlogn)

public class quickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                //swap

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
    public static void Qsort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            Qsort(arr, low, pivotIndex-1);
            Qsort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};

        int n = arr.length;

        Qsort(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
}
