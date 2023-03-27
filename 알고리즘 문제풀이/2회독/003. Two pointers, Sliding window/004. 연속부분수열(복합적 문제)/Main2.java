import java.util.*;



class Main2 {
	
	public int solution(int n, int m, int[] arr){
		int answer = 0, sum = 0, idx = 0;
		for(int i=0; i<n; i++){
			sum += arr[i];
			while(sum > m){
				sum -= arr[idx];
				idx++;
			}
			if(sum == m) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}