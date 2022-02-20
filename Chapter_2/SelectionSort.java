package Chapter_2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 1, 6, 5, 923, 1002, 1007, 1102, 22, 43, 12, 33, 6, 3, 10};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int minValue = array[minIndex];
            array[minIndex] = array[i];
            array[i] = minValue;
        }

        return array;
    }
}
