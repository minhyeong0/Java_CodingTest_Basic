import java.util.*;



class Main2 {
	static int[] fibo;
	public int solution(int n) {
		if (fibo[n] > 0)
			return fibo[n];
		else if (n == 1 || n == 2)
			return fibo[n] = 1;
		else
			return fibo[n] = solution(n - 2) + solution(n - 1);
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1];
		T.solution(n);
		for (int i = 1; i <= n; i++)
			System.out.print(fibo[i] + " ");
	}
}