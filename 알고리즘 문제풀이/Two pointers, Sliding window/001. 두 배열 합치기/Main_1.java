import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main_1 {
	
	public int[] Solution(int n, int m, int[] arr1, int[] arr2){
		int[] answer = new int[n+m];
		
		for(int i=0; i<n; i++)
			answer[i] = arr1[i];
		
		for(int i=n; i<n+m; i++)
			answer[i] = arr2[i];
		
		Arrays.sort(answer);
		
		return answer;
	}
	
	
	
	public static void main(String[] args) throws IOException{
		Main_1 T = new Main_1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++)
			arr1[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[n+m];
		st = new StringTokenizer(br.readLine());
		for(int i=n; i<n+m; i++)
			arr2[i] = Integer.parseInt(st.nextToken());
		for(int x : T.Solution(n, m, arr1, arr2))
			System.out.print(x + " ");
	}
}