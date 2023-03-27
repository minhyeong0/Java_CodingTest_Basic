package Algorithm.Prim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Prim {

    public ArrayList<Edge> primFunc(String startNode, ArrayList<Edge> edges){
        Edge currentEdge, poppedEdge, adjacentEdgeNode;
        ArrayList<Edge> currentEdgeList, candidateEdgeList, adjacentEdgeNodes;
        PriorityQueue<Edge> priorityQueue;
        ArrayList<String> connectedNodes = new ArrayList<>();
        ArrayList<Edge> mst = new ArrayList<>();
        HashMap<String, ArrayList<Edge>> adjacentEdges = new HashMap<>();

        for(int i=0; i<edges.size(); i++){
            currentEdge = edges.get(i);
            if(!adjacentEdges.containsKey(currentEdge.node1)){
                adjacentEdges.put(currentEdge.node1, new ArrayList<>());
            }

            if(!adjacentEdges.containsKey(currentEdge.node2)){
                adjacentEdges.put(currentEdge.node2, new ArrayList<>());
            }
        }

        for(int i=0; i<edges.size(); i++){
            currentEdge = edges.get(i);
            currentEdgeList =adjacentEdges.get(currentEdge.node1);
            currentEdgeList.add(new Edge(currentEdge.weight, currentEdge.node1, currentEdge.node2));

            currentEdgeList =adjacentEdges.get(currentEdge.node2);
            currentEdgeList.add(new Edge(currentEdge.weight, currentEdge.node2, currentEdge.node1));
        }

        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<>());
        priorityQueue = new PriorityQueue<>();
        for(int i=0; i<candidateEdgeList.size(); i++){
            priorityQueue.offer(candidateEdgeList.get(i));
        }


        while (priorityQueue.size() > 0) {
            poppedEdge = priorityQueue.poll();
            if(!connectedNodes.contains(poppedEdge.node2)){
                connectedNodes.add(poppedEdge.node2);
                mst.add(new Edge(poppedEdge.weight, poppedEdge.node1, poppedEdge.node2));

                adjacentEdgeNodes = adjacentEdges.getOrDefault(poppedEdge.node2, new ArrayList<>());

                for(int i=0; i<adjacentEdgeNodes.size(); i++){
                    adjacentEdgeNode = adjacentEdgeNodes.get(i);
                    if(!connectedNodes.contains(adjacentEdgeNode.node2)){
                        priorityQueue.offer(adjacentEdgeNode);
                    }
                }
            }
        }

        return mst;
    }
}
