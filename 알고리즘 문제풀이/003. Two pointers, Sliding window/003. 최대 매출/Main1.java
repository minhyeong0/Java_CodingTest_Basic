import java.util.*;





class Main1 {
	
	public int Solution(int n, int k, int[] arr){
		int answer = 0, sum = 0;
		for(int i=0; i<k; i++)
			sum+= arr[i];
		answer = sum;
		
		for(int i=k; i<n; i++){
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, k, arr));
	}
}