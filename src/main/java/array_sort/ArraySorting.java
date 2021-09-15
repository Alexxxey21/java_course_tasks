package array_sort;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] valueArray = {7, 4, 3, 8, 9, 2, 1, 3, 7};

        long startTime = System.nanoTime();
        bubbleSort(valueArray);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Sort array: " + Arrays.toString(valueArray));
        System.out.println("Array duration in miliseconds: " + duration);
    }

    private static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    isSorted = false;
                    changePlaces(array, i);
                }
            }
        }
    }

    private static void changePlaces(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i+1];
        array[i+1] = tmp;
    }
}
