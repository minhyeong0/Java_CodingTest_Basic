import java.util.*;




class Main_1 {
	public void DFS(int n) {
		if(n == 0) return;
		DFS(n / 2);
		System.out.print(n % 2);
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.DFS(n);
	}
}