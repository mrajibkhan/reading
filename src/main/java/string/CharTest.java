package string;

/**
 * Created by rajib.khan on 3/19/17.
 */
public class CharTest {

    public static void main(String [] args) {

        System.out.println("A = " + (int)'A');
        System.out.println("Z = " + (int) 'Z');

        System.out.println("a = " + (int)'a');
        System.out.println("z = " + (int) 'z');

        int diff = 'a' - 'A';
        System.out.println("Diff between 'a' and 'A' is " + diff);

        System.out.println("rajib -> to upper = " + toUpperCase("rajib"));

        System.out.println("RAJIB -> to lower = " + toLowerCase("RAJiB"));

    }


    public static String toUpperCase(String text) {
        char[] chars = text.toCharArray();
        String upper = "";
        for (char i : chars) {
            if(i >= 'a' && i <= 'z') {
                upper += (char) (i - 32);
            } else {
                upper += i;
            }
        }

        return upper;

    }

    public static String toLowerCase(String text) {
        String lower = "";
        for(char u : text.toCharArray()) {
            if ( u >= 'A' && u <= 'Z' ) {
                lower += (char) (u + 32);
            } else {
                lower += u;
            }
        }

        return lower;
    }
}
