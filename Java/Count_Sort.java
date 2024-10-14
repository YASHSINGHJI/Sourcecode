package SortingAlgos;

import java.util.Arrays;

public class Count_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 10, 9, 2, 4, 9, 7 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] != 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }

        }

    }
}
