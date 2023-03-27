import java.util.*;




class Main_1 {
	
	public int DFS(int n){
		if(n == 1)
			return 1;
		else
			return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.DFS(n));
	}
}