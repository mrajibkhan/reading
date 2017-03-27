package string;

/**
 * Created by rajib.khan on 3/27/17.
 *
 * Lexicographically first palindromic string
 * Rearrange the characters of the given string to form a lexicographically first palindromic string.
 * If no such string exists display message “no palindromic string”.
 * Source: http://www.geeksforgeeks.org/lexicographically-first-palindromic-string/
 */
public class LexicographicalPalindrom {

    static int MAX_CHAR = 26;
    public static int[] countCharFrequency (String inputStr) {
        int[] frequency = new int[MAX_CHAR];
        for(int i=0; i < inputStr.length(); i++) {
            frequency[inputStr.charAt(i) - 'a']++;
        }

        return frequency;
    }

    public static boolean canMakePalindrome(int[] frequency, int length) {
        boolean canMakePalindrome = false;
        int oddChars = 0;

        for(int i = 0; i < MAX_CHAR; i++) {
            if(frequency[i] % 2 > 0) {
                oddChars++;
            }
        }

        if(length % 2 == 0) {
          if (oddChars > 0) {
             return false;
          }

          return true;
        }

        // max 1 odd char count
        if (oddChars == 1) {
            canMakePalindrome = true;
        }

        return canMakePalindrome;

    }

    public static String findFirstPalindromic(String input) {
        int[] frequency = countCharFrequency(input);
        if (!canMakePalindrome(frequency, input.length())) {
            return "no palindromic string";
        }

        String front = "";
        String end = "";
        String odd = "";

        for (int i = 0; i < MAX_CHAR; i++) {
            if (frequency[i] == 0) {
                continue;
            }
            if (frequency[i] % 2 == 0) {
                for (int j = 0; j < frequency[i] / 2; j++) {
                    front += (char) (i + 'a');
                    end = (char) (i + 'a') + end;
                }
            } else {
                for (int j = 0; j < frequency[i] ; j++) {
                    odd += (char) (i + 'a');
                }
            }
        }

        return front + odd + end;
    }

    public static void main(String[] args) {
        String input = "madam";
        int[] frequency = countCharFrequency(input);

        System.out.println("a -> " + frequency[0]);
        System.out.println("d -> " + frequency[3]);
        System.out.println("m -> " + frequency[12]);

        System.out.println("madam -> " + canMakePalindrome(frequency, "madam".length()));

        System.out.println("Palindrome of madam -> " + findFirstPalindromic("madam"));

        //malayalam
        System.out.println("Palindrome of malayalam -> " + findFirstPalindromic("malayalam"));

    }
}
