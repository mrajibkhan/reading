package sort;

/**
 * Created by rajib.khan on 3/18/17.
 */
public class QuickSort {

    public static void main(String[] args){
       int[] toSort = {1,3,5,7, 0, 2, 4, 6};

       sort(toSort, 0, toSort.length -1);

       for (int i : toSort) {
           System.out.print(i + ",");
       }
    }

    public static int[] sort(int[] arr, int low, int high) {
       if ( arr == null || arr.length <= 0 || low >= high) {
           return arr;
       }

       int i = low;
       int j = high;

       int pivot = low + (high - low) / 2;


       while( i <= j) {
           System.out.println("loop: " + i + ":" + j);

           while (arr[i] < arr[pivot]) {
                i++;
           }

           while (arr[j] > arr[pivot]) {
               j--;
           }

           if ( i <= j) {
               int tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
               i++;
               j--;
           }

       }

       if(low < j) {
            sort(arr, low, j);
       }

        if(high > i) {
            sort(arr, i, high);
        }

       return arr;
    }
}
