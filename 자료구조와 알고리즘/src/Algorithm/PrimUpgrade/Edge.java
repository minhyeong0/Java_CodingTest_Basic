package Algorithm.PrimUpgrade;

public class Edge implements Comparable<Edge>{
    public String node;
    public int weight;

    public Edge(String node, int weight){
        this.node = node;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "(" + node + ", " + weight + ")";
    }

    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}
