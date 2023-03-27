import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = 1;
		int b = 1;
		sb.append(a + " " + b);
		
		for(int i=2; i<n; i++){
			int res = a + b;
			sb.append(" " + res);
			a = b;
			b = res;
		}
		
		System.out.println(sb);
		
	}
}