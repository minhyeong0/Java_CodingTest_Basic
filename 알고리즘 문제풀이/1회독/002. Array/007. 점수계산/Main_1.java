import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n+1];

		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int score = 0;
		int cnt = 1;
		
		for(int i=0; i<n; i++){
			if(arr[i] != arr[i+1] && arr[i+1] == 0){
				score += cnt;
				cnt = 1;
			}else if(arr[i] == arr[i+1] && arr[i] == 1){
				score += cnt;
				cnt++;
			}
		}
		System.out.println(score);
	}
}