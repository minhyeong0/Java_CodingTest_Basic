import java.util.*;




class Main1 {
	
	public int solution(int n, int[][] arr){
		int answer = Integer.MIN_VALUE;
		int tmp = 0;
		
		for(int i=0; i<n; i++)
			tmp += arr[i][i];
		answer = Math.max(answer, tmp);
		
		tmp = 0;
		for(int i=0; i<n; i++)
			tmp += arr[i][n-1-i];
		answer = Math.max(answer, tmp);
		
		
		for(int i=0; i<n; i++){
			tmp = 0;
			for(int j=0; j<n; j++)
				tmp += arr[i][j];
			answer = Math.max(answer, tmp);
		}
		
		for(int i=0; i<n; i++){
			tmp = 0;
			for(int j=0; j<n; j++)
				tmp += arr[j][i];
			answer = Math.max(answer, tmp);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		System.out.println(T.solution(n, arr));
	}
}