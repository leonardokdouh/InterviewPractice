package Leo;

import java.util.Arrays;

public class SortQuickSort {
    public static void main(String[] args) {
        int[] myArray = {10, 4, 55, 12, 50, 5};
        quickSort(myArray, 0, (myArray.length - 1));
        System.out.println(Arrays.toString(myArray));
    }

    public static int partition(int[] numbers, int low, int high) {
        int pivote = numbers[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers[j] < pivote) {
                i++;
                swap(numbers, i, j);
            }
        }
        swap(numbers, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void swap(int[] numb, int i, int j) {
        int temporal = numb[i];
        numb[i] = numb[j];
        numb[j] = temporal;
    }

}
