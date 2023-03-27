package Algorithm.Kruskal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Kruskal {

    HashMap<String, String> parent = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();


    public ArrayList<Edge> kruskalFunc(ArrayList<String> vertices, ArrayList<Edge> edges){
        ArrayList<Edge> mst = new ArrayList<>();
        Edge currentEdge;

        //1. 초기화
        for(int i=0; i<vertices.size(); i++)
            makeSet(vertices.get(i));

        //2. 간선 weight 기반 sorting
        Collections.sort(edges);

        for(int i=0; i<edges.size(); i++){
            currentEdge = edges.get(i);
            if(find(currentEdge.nodeV) != find(currentEdge.nodeU)){
                union(currentEdge.nodeV, currentEdge.nodeU);
                mst.add(currentEdge);
            }
        }
        return mst;
    }

    public String find(String node){
        //path compression 기법
        if(parent.get(node) != node)
            parent.put(node, find(parent.get(node)));

        return parent.get(node);
    }

    public void union(String NodeV, String NodeU){
        String root1 = find(NodeV);
        String root2 = find(NodeU);
        
        //union-by-rank 기법
        if(rank.get(root1) > rank.get(root2)){
            parent.put(root2, root1);
        } else {
            parent.put(root1, root2);
            if(parent.get(root1) == parent.get(root2)){
                rank.put(root2, rank.get(root2)+1);
            }
        }
    }

    public void makeSet(String node){
        parent.put(node, node);
        rank.put(node, 0);
    }
}
