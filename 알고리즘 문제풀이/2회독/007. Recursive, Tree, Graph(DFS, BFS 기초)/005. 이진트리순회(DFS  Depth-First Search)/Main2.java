import java.util.*;

class Node {
	int data;
	Node lt, rt;
	
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}


class Main2 {
	Node root;
	
	public void DFS(Node root) {
		if (root == null) return;
		else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		T.root = new Node(1);
		T.root.lt = new Node(2);
		T.root.rt = new Node(3);
		T.root.lt.lt = new Node(4);
		T.root.lt.rt = new Node(5);
		T.root.rt.lt = new Node(6);
		T.root.rt.rt = new Node(7);
		T.DFS(T.root);
	}
}