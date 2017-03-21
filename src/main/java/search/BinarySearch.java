package search;

import java.util.Arrays;

/**
 * Created by rajib.khan on 3/18/17.
 */
public class BinarySearch {

    public static void main(String[] args ) {

        int[] arr = {0,1,3,5,7,9, 12, 14,16, 18};
        Arrays.sort(arr);
        int toFind = 16;


        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("");

        int index = search(arr, 0, arr.length - 1, toFind);

        if (index == -1) {
            System.out.println("Not found : " + toFind);
        } else {

            System.out.println("Index of " + toFind + " = " + index + " value = " + arr[index]);
        }
    }

    public static int search(int[] arr, int low, int high, int toSearch) {

        if (arr == null || low >= high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == toSearch) {

            return mid;

        } else if (arr[mid] < toSearch) {

            return search(arr, (mid +1), high, toSearch);
        } else if (arr[mid] > toSearch) {
            return search(arr, low, (mid -1), toSearch);
        }

        return -1;
    }
}
