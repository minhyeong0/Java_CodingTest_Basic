import java.util.*;


class Main_1 {
	public int solution(int n){
		if(n == 1 || n == 2)
			return n;
		else
			return solution(n-2) + solution(n-1);
	}
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}