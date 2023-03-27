import java.util.*;




class Main1 {
	
	public void DFS(int n){
		if(n == 0) return;
		else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		T.DFS(11);
	}
}