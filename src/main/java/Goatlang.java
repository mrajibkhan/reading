import java.util.Arrays;
import java.util.List;

/**
 * Created by rajib.khan on 2/18/17.
 */
public class Goatlang {

//    List<Character> l = Arrays.asList('a','e');  


    public static void main(String[] args) {

        char[] str = "loves".toCharArray();

        char t = str[0];

//        if() {
//
//        }

        StringBuffer b = new StringBuffer();

        b.append(str, 1, str.length -1).append(t).append("ma");

        System.out.println(b);

    }
}
