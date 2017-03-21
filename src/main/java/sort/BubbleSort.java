package sort;

public class BubbleSort {

    static int[] toSort  = {9,8,7,6,5,4,3,2,1,0};

    public static void main(String[] args) {

        boolean swap = false;
        for(int i = 0; i < toSort.length -1; i++) {
            swap = false;
            for(int j = 0; j < toSort.length -1; j++) {
                System.out.println("Iteration: " + (i +1) + ":" + (j +1));
                int current = toSort[j];
                if(toSort[j] > toSort[j + 1]) {
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = current;
                    swap = true;
                }
            }
            if (!swap) break;
        }


        for(int p = 0; p < toSort.length; p++) {
            System.out.print(toSort[p] + ", ");
        }
    }
}