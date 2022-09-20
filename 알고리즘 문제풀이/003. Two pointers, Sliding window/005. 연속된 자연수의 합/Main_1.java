import java.util.*;



class Main_1 {
	
	public int Solution(int n){
		int answer = 0, sum = 0;
		int lt = 1;
		
		for(int rt=1; rt<n; rt++){
			sum += rt;
			
			while(sum > n){
				sum -= lt++;
			}
			
			if(sum == n) answer++;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.Solution(n));
	}
}