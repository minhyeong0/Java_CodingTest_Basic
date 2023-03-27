import java.util.*;


class Main_1 {
	
	public int Solution(int n, int m, int[] arr){
		int answer = 0, sum = 0, lt = 0;
		for(int rt=0; rt<n; rt++){
			sum += arr[rt];
			
			while(sum > m)
				sum -= arr[lt++];
			
			if(sum == m) answer++;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, m, arr));
	}
}