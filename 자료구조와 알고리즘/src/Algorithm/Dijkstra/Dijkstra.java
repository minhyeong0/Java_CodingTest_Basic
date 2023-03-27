package Algorithm.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge>{
    public int distance;
    public String vertex;

    public Edge(int distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "{vertex: " + vertex + ", distance: " + distance + "}";
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }
}

public class Dijkstra {
    public HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge>> graph, String start){
        Edge edgeNode, adjacentNode;
        ArrayList<Edge> nodeList;
        int currentDistance, weight, distance;
        String currentNode, adjacent;
        HashMap<String, Integer> distances = new HashMap<>();

        for(String key : graph.keySet()){
            distances.put(key,Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(distances.get(start), start));

        while (priorityQueue.size() > 0) {
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currentNode = edgeNode.vertex;

            if(distances.get(currentNode) < currentDistance)
                continue;

            nodeList = graph.get(currentNode);

            for(int i=0; i<nodeList.size(); i++){
                adjacentNode = nodeList.get(i);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;
                distance = currentDistance + weight;

                if(distance < distances.get(adjacent)){
                    distances.put(adjacent, distance);
                    priorityQueue.add(new Edge(distance, adjacent));
                }
            }

        }
        return distances;
    }



    public static void main(String[] args) {
        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>(Arrays.asList(new Edge(8,"B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>(Arrays.asList(new Edge(5,"B"), new Edge(2,"D"))));
        graph.put("D", new ArrayList<>(Arrays.asList(new Edge(3,"E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<>(Arrays.asList(new Edge(1,"F"))));
        graph.put("F", new ArrayList<>(Arrays.asList(new Edge(5, "A"))));

        Dijkstra dObject = new Dijkstra();
        System.out.println(dObject.dijkstraFunc(graph, "A"));
    }
}
