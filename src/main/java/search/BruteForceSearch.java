package search;

/**
 * Created by rajib.khan on 3/19/17.
 */
public class BruteForceSearch {

    public static int bruteForceSearch (String text, String pattern) {

        if(text == null || pattern == null || pattern.length() > text.length()) {
            return -1;
        }

        return bruteForceSearch(text.toCharArray(), pattern.toCharArray());

    }

    public static int bruteForceSearch (char[] textArr, char[] patternArr) {

        int textSize = textArr.length;
        int patternSize = patternArr.length;

        int i = 0;
        int j = 0;

        while (i <= textSize - patternSize) {

            j = 0;
            while ( j < patternSize && patternArr[j] == textArr[i + j]) {
                j++;
            }

            if (j == patternSize) {
                return i;
            }

            i++;

        }

        return -1;

    }


    public static void main(String[] args) {
        int index = bruteForceSearch("Rajib", "ib");
        System.out.println("Result = " + index);
    }
}
