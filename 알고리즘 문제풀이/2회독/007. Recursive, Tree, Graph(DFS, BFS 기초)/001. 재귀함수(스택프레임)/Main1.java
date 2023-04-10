import java.util.*;



class Main1 {
	public void solution(int n) {
		if (n == 0) return;
		else {
			solution(n - 1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.solution(n);
	}
}