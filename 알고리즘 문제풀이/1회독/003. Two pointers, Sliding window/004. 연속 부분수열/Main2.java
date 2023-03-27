import java.util.*;


class Main2 {
	
	public int Solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			while (sum > m) {
				sum -= arr[lt++];
			}
			if(sum == m) {
				answer++;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, m, arr));
	}
}