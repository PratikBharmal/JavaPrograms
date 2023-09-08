package sortingAlgorithms;

public class selectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 8, 4, 5 };

        // Time complexity of Selection Sort is O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }

            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }

}
