package Algorithm.Prim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Run1 {
    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(2, "A", "B"));
        priorityQueue.add(new Edge(5, "B", "D"));
        priorityQueue.add(new Edge(3, "C", "A"));

        while (priorityQueue.size() > 0){
            System.out.println(priorityQueue.poll());
        }

        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>(Arrays.asList()));
        graph.put("B", new ArrayList<>(Arrays.asList()));
        System.out.println(graph.containsKey("A"));
        graph.getOrDefault("C", new ArrayList<>());
    }
}
