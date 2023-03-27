import java.util.*;



class Main2 {
	
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 1;
		
		for (int rt = 1; rt <= n / 2 + 1; rt++) {
			sum += rt;
			while(sum > n) {
				sum -= lt;
				lt++;
			}
			if(sum == n) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}