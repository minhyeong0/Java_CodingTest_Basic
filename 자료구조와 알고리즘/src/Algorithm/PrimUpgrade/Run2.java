package Algorithm.PrimUpgrade;

import java.util.HashMap;

public class Run2 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> mygraph = new HashMap<>();
        HashMap<String, Integer> edges;

        edges = new HashMap<>();
        edges.put("B", 7);
        edges.put("D", 5);
        mygraph.put("A", edges);


        edges = new HashMap<>();
        edges.put("A", 7);
        edges.put("D", 9);
        edges.put("C", 8);
        edges.put("E", 7);
        mygraph.put("B", edges);


        edges = new HashMap<>();
        edges.put("B", 8);
        edges.put("E", 5);
        mygraph.put("C", edges);


        edges = new HashMap<>();
        edges.put("A", 5);
        edges.put("B", 9);
        edges.put("E", 7);
        edges.put("F", 6);
        mygraph.put("D", edges);


        edges = new HashMap<>();
        edges.put("B", 7);
        edges.put("C", 5);
        edges.put("D", 7);
        edges.put("F", 8);
        edges.put("G", 9);
        mygraph.put("E", edges);


        edges = new HashMap<>();
        edges.put("D", 6);
        edges.put("E", 8);
        edges.put("G", 11);
        mygraph.put("F", edges);


        edges = new HashMap<>();
        edges.put("E", 9);
        edges.put("F", 11);
        mygraph.put("G", edges);

        PrimUpgrade pObject = new PrimUpgrade();
        System.out.println(pObject.improvedPrimFunc(mygraph, "A"));
    }
}
