import java.util.*;




class Main1 {
	public int solution(int n) {
		if (n == 1)
			return n;
		else
			return n * solution(n - 1);
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}