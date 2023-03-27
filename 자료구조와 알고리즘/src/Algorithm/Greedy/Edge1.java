package Algorithm.Greedy;

import java.util.Arrays;

public class Edge1 implements Comparable<Edge1>{
    public Integer distance;
    public String vertex;

    public Edge1(Integer distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Edge1 e) {
        return this.distance - e.distance;
    }

    public static void main(String[] args) {
        Edge1 edge1 = new Edge1(12, "A");
        Edge1 edge2 = new Edge1(10, "A");
        Edge1 edge3 = new Edge1(13, "A");

        Edge1[] edges = new Edge1[]{edge1, edge2, edge3};
        Arrays.sort(edges);

        for(int i=0; i<edges.length; i++)
            System.out.print(edges[i].distance + " ");
    }


}
