package graph;

/**
 * Created by rajib.khan on 3/25/17.
 */

import org.junit.*;
import org.junit.runner.*;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DistanceFloydWarshall {

    public Double[][] graph;
    public boolean hasNegativeCycle = false;



    public void initGraph(int size) {
        graph = new Double[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if( i == j) {
                    graph[i][j] = Double.valueOf(0);
                } else {
                    graph[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }

    }

    public void addEdge (int source, int dest, Double distance) {

        graph[source][dest] = distance;
    }


    public Double[][] getDistances() {
        int n = this.graph.length;
        Double[][] distance = copyOf(this.graph, n);
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {

                    //System.out.println("i:" + i + ", j:" + j + "  D=" + distance[i][j]);
                    distance[i][j] = Math.min(distance[i][j], (distance[i][k] + distance[k][j]));
                }
            }
        }

        return distance;
    }

}
