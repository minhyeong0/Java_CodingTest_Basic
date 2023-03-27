import java.util.*;





class Main1 {
	
	public int DFS(int n) {
		if(n == 1)
			return n;
		else
			return n * DFS(n - 1);
	}
	
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		System.out.println(T.DFS(5));
	}
}