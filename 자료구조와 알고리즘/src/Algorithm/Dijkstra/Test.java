package Algorithm.Dijkstra;

import java.util.PriorityQueue;


public class Test {
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

    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Test().new Edge(2, "A"));
        priorityQueue.add(new Test().new Edge(5, "B"));
        priorityQueue.offer(new Test().new Edge(1, "C"));
        priorityQueue.offer(new Test().new Edge(7, "D"));
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
    }
}
