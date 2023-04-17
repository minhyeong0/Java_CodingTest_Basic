import java.util.*;



class Main1 {
	public void solution(int L) {
		if (L > 7) return;
		else {
			System.out.print(L + " ");
			solution(L * 2);
			solution(L * 2 + 1);
		}
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		T.solution(1);
	}
}