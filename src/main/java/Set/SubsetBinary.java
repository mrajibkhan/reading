package Set;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajib.khan on 3/25/17.
 * source: http://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
 *
 */
public class SubsetBinary {


    public static List<List<String>> allCombinations(String[] s) {

        int length = s.length;
        int totalCombination = 1 << s.length;

        System.out.println("total: " + totalCombination);
        List<List<String>> r = new ArrayList<List<String>>();

        for (int i=0; i < totalCombination; i++) {
           List<String> c = new ArrayList<String>();
           for(int j = 0; j < length; j++) {
               System.out.println("1<<" + j + " :: " + Integer.toBinaryString(1<<j));
               System.out.println(i + " & 1 << " + j + " = " + (i & (1 << j)));
               if ( (i & (1 << j)) > 0) {

                   c.add(s[j]);
               }
           }
           r.add(c);

        }

        return r;
    }


    public static void main(String[] args) {



        List<List<String>> r = allCombinations(new String[] {"a","b","c"});

        System.out.println(r);

        System.out.println(Integer.toBinaryString(1<<3));
        System.out.println(1<<3);
    }
}
