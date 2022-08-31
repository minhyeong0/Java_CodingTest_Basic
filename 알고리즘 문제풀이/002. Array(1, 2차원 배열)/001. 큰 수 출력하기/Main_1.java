import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[a+1];
		
		for(int i=1; i<=a; i++){
			c[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=a; i++){
			if(c[i] > c[i-1]){
				System.out.print(c[i] + " ");
			}
		}
	}
}