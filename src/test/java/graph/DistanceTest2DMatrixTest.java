package graph;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by rajib.khan on 3/25/17.
 *
 * Given a N X N matrix (M) filled with 1 , 0 , 2 , 3 . Find the minimum numbers of moves needed to move from source to destination (sink) .
 * while traversing through blank cells only. You can traverse up, down, right and left.
 * A value of cell 1 means Source.
 * A value of cell 2 means Destination.
 * A value of cell 3 means Blank cell.
 * A value of cell 0 means Blank Wall.
 * Note : there is only single source and single destination.they may be more than one path from source to destination(sink).
 * each move in matrix we consider as ‘1’
 *
 *
 * Input : M[3][3] =
 * {{ 0 , 3 , 2 },
 *  { 3 , 3 , 0 },
 *  { 1 , 3 , 0 }};
 *  Output : 4
 *
 *Input : M[4][4] =
 * {{ 3 , 3 , 1 , 0 },
 *  { 3 , 0 , 3 , 3 },
 *  { 2 , 3 , 0 , 3 },
 *  { 0 , 3 , 3 , 3 }};
 * Output : 4



 */
public class DistanceTest2DMatrixTest {

    DistanceFloydWarshall dfw = new DistanceFloydWarshall();

    int src = 0;
    int dest = 0;
    Double[][] distances;

   @Before
    public void setup() {

       int[][] arr = new int[][] {{ 3 , 3 , 1 , 0 },
                                  { 3 , 0 , 3 , 3 },
                                  { 2 , 3 , 0 , 3 },
                                  { 0 , 3 , 3 , 3 }};

       int x = arr.length;
       int y = arr[x - 1].length;

       dfw.initGraph(x * y);




       int currentNode = -1;
       int currentNodeVal = 0;
       for(int i = 0; i < x; i++) {
           for(int j = 0; j < y; j++) {
               currentNode = i * y + j;
               currentNodeVal = arr[i][j];

               if (currentNodeVal == 0) {
                   continue;
               }

               if(currentNodeVal == 1) {
                    src = currentNode;
               } else if (currentNodeVal == 2) {
                    dest = currentNode;
               }



               if((j + 1) < y && arr[i][j+1] != 0) {
                  dfw.addEdge(currentNode, (i * y + (j+1)), 1.0);
               }

               if ((j - 1 >= 0) && arr[i][j-1] != 0) {
                   dfw.addEdge(currentNode, (i * y + (j-1)), 1.0);
               }

               if((i + 1) < x && arr[i + 1][j] != 0) {
                   dfw.addEdge(currentNode, ((i + 1) * y + j), 1.0);
               }

               if ((i - 1 >= 0) && arr[i -1][j] != 0) {
                   dfw.addEdge(currentNode, ((i - 1) * y + j), 1.0);
               }
           }
       }

       distances = dfw.getDistances();
   }

   @Test
   public void checkSrcAndDestNodes () {
       assertThat("src should be 2", src, is(2));
       assertThat("src should be 9", dest, is(8));
   }

   @Test
   public void stepFromSrcToDest() {
       System.out.println("Source to Dest steps = " + distances[src][dest]);
       assertThat("src(1) to dest(2) should take 4 steps", distances[src][dest], is(4.0));
   }

}
