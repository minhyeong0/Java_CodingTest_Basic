import java.util.*;




class Main_2 {
	
	public int Solution(int n){
		int answer = 0, sum = 0, lt = 1;
		
		for(int i=1; i<n; i++){
			sum += i;
			while(sum > n){
				sum -= lt++;
			}
			if(sum == n) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.Solution(n));
	}
}