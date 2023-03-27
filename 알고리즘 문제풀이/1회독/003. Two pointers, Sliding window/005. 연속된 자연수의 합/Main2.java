import java.util.*;





class Main2 {
	
	public int Solution(int n){
		int answer = 0, cnt = 1;
		n--;
		while(n > 0){
			cnt++;
			n = n - cnt;
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.Solution(n));
	}
}