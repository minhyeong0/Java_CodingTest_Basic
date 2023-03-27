import java.util.*;



class Main1 {
	
	public int solution(int n) {
		int answer = 0, cnt = 1;
		n -= cnt;
		while (n > 0) {
			cnt++;
			n -= cnt;
			if(n % cnt == 0) answer++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}