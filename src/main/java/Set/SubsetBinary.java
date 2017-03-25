package Set;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajib.khan on 3/25/17.
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
               if ( (i & (1 << j)) > 0) {
                   c.add(s[j]);
               }
           }
           r.add(c);

        }

        return r;
    }


    public static void main(String[] args) {



        List<List<String>> r = allCombinations(new String[] {"r", "a", "i", "y", "a", "n"});

        System.out.println(r);

    }
}
