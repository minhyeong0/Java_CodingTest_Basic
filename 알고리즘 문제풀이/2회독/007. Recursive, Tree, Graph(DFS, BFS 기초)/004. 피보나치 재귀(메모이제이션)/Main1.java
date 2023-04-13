import java.util.*;


class Main1 {
	public int solution(int n, int[] ch) {
		if (ch[n] != 0)
			return ch[n];
		else if (n == 1 || n == 2) {
			ch[n] = 1;
			System.out.print(ch[n] + " ");
			return ch[n];
		} else {
			ch[n] = solution(n - 2, ch) + solution(n - 1, ch);
			System.out.print(ch[n] + " ");
			return ch[n];
		}
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ch = new int[n+1];
		T.solution(n, ch);
	}
}