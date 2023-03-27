import java.util.*;



class Main2 {
	
	public int solution(int n, int[][] arr){
		int answer = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int cnt = 0;
				if(i < 1) cnt++;
				else
					if(arr[i][j] > arr[i-1][j]) cnt++;
				
				if(j < 1) cnt++;
				else
					if(arr[i][j] > arr[i][j-1]) cnt++;
				
				if(i >= n-1) cnt++;
				else
					if(arr[i][j] > arr[i+1][j]) cnt++;
				if(j >= n-1) cnt++;
				else
					if(arr[i][j] > arr[i][j+1]) cnt++;
				if(cnt == 4) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		System.out.println(T.solution(n, arr));
	}
}