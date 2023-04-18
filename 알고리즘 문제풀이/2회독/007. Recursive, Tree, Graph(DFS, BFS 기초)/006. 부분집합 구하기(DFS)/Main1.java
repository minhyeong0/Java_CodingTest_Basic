import java.util.*;



class Main1 {
	static int n;
	static int[] ch;
	
	public void DFS(int L) {
		if (L == n + 1) {
			for (int i = 1; i <= n; i++) {
				if(ch[i] == 1)
					System.out.print(i + " ");
			}
			System.out.println();
		} else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ch = new int[n+1];
		T.DFS(1);
	}
}