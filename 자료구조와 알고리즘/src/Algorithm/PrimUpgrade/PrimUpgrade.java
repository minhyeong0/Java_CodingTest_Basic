package Algorithm.PrimUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PrimUpgrade {
    public ArrayList<Path> improvedPrimFunc(HashMap<String, HashMap<String, Integer>> graph, String startNode){
        ArrayList<Path> mst = new ArrayList<>();
        PriorityQueue<Edge> keys = new PriorityQueue<>();
        HashMap<String, Edge> keysObjects = new HashMap<>();
        HashMap<String, String> mstPath = new HashMap<>();
        Integer totalWeight = 0;
        HashMap<String, Integer> linkedEdges;
        Edge edgeObject, poppedEdge, linkedEdge;

        for(String key : graph.keySet()){
            if(key == startNode){
                edgeObject = new Edge(key, 0);
                mstPath.put(key, key);
            } else {
                edgeObject = new Edge(key, Integer.MAX_VALUE);
                mstPath.put(key, null);
            }
            keys.add(edgeObject);
            keysObjects.put(key, edgeObject);
        }

        while (keys.size() > 0) {
            poppedEdge = keys.poll();
            keysObjects.remove(poppedEdge.node);
            mst.add(new Path(mstPath.get(poppedEdge.node),poppedEdge.node, poppedEdge.weight));
            totalWeight += poppedEdge.weight;
            linkedEdges = graph.get(poppedEdge.node);

            for(String adjacent : linkedEdges.keySet()){
                if(keysObjects.containsKey(adjacent)){
                    linkedEdge = keysObjects.get(adjacent);
                    if(linkedEdges.get(adjacent) < linkedEdge.weight) {
                        linkedEdge.weight = linkedEdges.get(adjacent);
                        mstPath.put(adjacent, poppedEdge.node);
                        keys.remove(linkedEdge);
                        keys.add(linkedEdge);
                    }
                }
            }
        }

        System.out.println(totalWeight);
        return mst;
    }
}
