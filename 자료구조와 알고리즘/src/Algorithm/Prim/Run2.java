package Algorithm.Prim;

import java.util.ArrayList;

public class Run2 {
    public static void main(String[] args) {
        ArrayList<Edge> myEdges = new ArrayList<>();
        myEdges.add(new Edge(7, "A", "B"));
        myEdges.add(new Edge(5, "A", "D"));
        myEdges.add(new Edge(8, "B", "C"));
        myEdges.add(new Edge(9, "B", "D"));
        myEdges.add(new Edge(7, "D", "E"));
        myEdges.add(new Edge(5, "C", "E"));
        myEdges.add(new Edge(7, "B", "E"));
        myEdges.add(new Edge(6, "D", "F"));
        myEdges.add(new Edge(8, "E", "F"));
        myEdges.add(new Edge(9, "E", "G"));
        myEdges.add(new Edge(11, "F", "G"));

        Prim pObject = new Prim();
        System.out.println(pObject.primFunc("A", myEdges));
    }
}
