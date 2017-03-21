package sort;

import java.util.Arrays;

/**
 * Created by rajib.khan on 3/15/17.
 */
public class InsertionSort {


    public static void main(String[] args){
      System.out.println(print(sort(new int[] {9,8,7,5,6,4})));
    }

    public static String print(int[] sorted) {

        String s = "";

        for(int i : sorted) {
            s = s + i;
        }
        return s;
    }

    public static int[] sort(int[] toSort) {

        /**
         * start from 2nd element. compare it with the sub array in left and
         * swap if necessary (right to left)
         */
        for(int i = 1; i < toSort.length; i++){
            int tmp  = toSort[i];

            int j;

            for (j = i - 1; j >= 0 && toSort[j] > tmp ; j--) {

                toSort[j + 1] = toSort[j];
                System.out.println("loop: " + i + ":" + j + " array=" + print(toSort));

            }

            toSort[ j + 1] = tmp;
            System.out.println("after " + i  + " :" + j + " : " + print(toSort));

        }

        return toSort;
    }
}
