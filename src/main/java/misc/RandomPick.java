package misc;

/**
 * Created by rajib.khan on 3/26/17.
 *
 * Shuffle cards with equal probability
 */
public class RandomPick {

    public static void shuffle (int[] elements) {

        int length = elements.length;
        int temp;
        int counter = 0;

        int index = -1;
        while(counter < length) {

            index = (int)(Math.random() * (length - counter)) + counter;

            temp = elements[index];

            elements[index] = elements[counter];
            elements[counter] = temp;

            counter++;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};

        shuffle(a);
        for(int i : a) {
            System.out.print( i +  " ");
        }
    }
}
