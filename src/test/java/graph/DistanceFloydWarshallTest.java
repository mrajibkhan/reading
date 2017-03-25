package graph;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rajib.khan on 3/25/17.
 */
public class DistanceFloydWarshallTest {


    /////////////////////////////// TEST //////////////////////////
  /*

                        10.0
                  (0) ---------- (3)
            5.0  /   \ 9.0      /
                /     \        / 10.0
               (1)----(2)-----/
                   3.0
   */
    //////////////////////////////////////////////////////////////


    DistanceFloydWarshall s;

    Double[][] distances;

    @Before
    public void setupGraph() {
        s = new DistanceFloydWarshall();
        s.initGraph(4);
        s.addEdge(0,1,5.0);
        s.addEdge(0,2,9.0);
        s.addEdge(0,3,10.0);
        s.addEdge(1,2,3.0);
        s.addEdge(2,3,1.0);

        distances = s.getDistances();



    }


    @Test
    public void minDistance0to3 () {
        System.out.println(distances[0][3]);
        assertThat("Distance from 0 to 3 should euqals 9.0", distances[0][3], is(9.0));
    }

    @Test
    public void minDistance0to2 () {
        System.out.println(distances[0][2]);
        assertThat("Distance from 0 to 3 should euqals 8.0", distances[0][2], is(8.0));
    }

}