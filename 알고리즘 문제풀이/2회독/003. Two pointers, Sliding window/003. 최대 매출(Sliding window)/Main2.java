import java.util.*;



class Main2 {
	
	public int solution(int n, int k, int[] arr){
		int answer = 0, tmp = 0;
		for(int i=0; i<k-1; i++)
			tmp += arr[i];
		
		for(int i=k-1; i<n; i++){
			tmp += arr[i];
			answer = Math.max(answer, tmp);
			tmp -= arr[i-(k-1)];
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}