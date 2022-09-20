import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;





class Main_1 {
	
	public int Solution(int n, int[][] arr){
		int answer = 0;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(arr[i][j] <= arr[i][j-1]) continue;
				if(arr[i][j] <= arr[i][j+1]) continue;
				if(arr[i][j] <= arr[i-1][j]) continue;
				if(arr[i][j] <= arr[i+1][j]) continue;
				answer++;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		Main_1 T = new Main_1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+2][n+2];
		for(int i=1; i<=n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.Solution(n, arr));
	}
}