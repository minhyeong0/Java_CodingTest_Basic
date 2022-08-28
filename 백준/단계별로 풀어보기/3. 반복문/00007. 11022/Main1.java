import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터크기 : ????
		//사용한 시간복잡도 : n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=a; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("Case #" + i + ": ");
			sb.append(b + " + " + c + " = " + (b + c));
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}