package string;

/**
 * Created by rajib.khan on 3/26/17.
 */
public class Palindrome {

    public static boolean isPalindrome(String input) {

        boolean isPalindrome = false;
        int length, start, end, middle;

        length = input.length();
        start = 0;
        end = length - 1;
        middle = (start + end) / 2;

        while (start <= middle) {
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            } else {
                break;
            }
        }

        System.out.println(start + " : " + end);

        if (start == middle + 1) {
            isPalindrome = true;
        }

        return isPalindrome;
    }


    public static void main(String[] args) {
        System.out.println("madam -> " + isPalindrome("madam"));
    }
}
