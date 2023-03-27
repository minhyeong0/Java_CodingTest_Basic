package Algorithm.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Edge2 implements Comparable<Edge2>{
    public Integer distance;
    public String vertex;

    public Edge2(Integer distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Edge2 e) {
        return this.distance - e.distance;
    }

    public static void main(String[] args) {
        Edge2 edge1 = new Edge2(12, "A");
        Edge2 edge2 = new Edge2(10, "A");
        Edge2 edge3 = new Edge2(13, "A");

        Edge2[] edges = new Edge2[]{edge1, edge2, edge3};
        Arrays.sort(edges, new Comparator<Edge2>() {
            @Override
            public int compare(Edge2 e1, Edge2 e2) {
                return e2.distance - e1.distance;
            }
        });

        for(int i=0; i<edges.length; i++)
            System.out.print(edges[i].distance + " ");
    }



}
