package Chapter_4;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 1, 6, 5, 923, 1002, 1007, 1102, 22, 43, 12, 33, 6, 3, 10};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int from, int to) {

        if (from >= to) {
            return;
        }

        int pivot = array[to];
        int leftPointer = from;
        int rightPointer = to;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, to);

        quickSort(array, from, leftPointer - 1);
        quickSort(array, leftPointer + 1, to);
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index2];
        array[index2] = array[index1];
        array[index1] = tmp;
    }
}
