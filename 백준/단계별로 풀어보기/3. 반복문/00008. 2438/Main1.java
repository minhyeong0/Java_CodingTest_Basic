import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터 크기 : 100
		//사용한 시간복잡도 : n^2 (100^2 = 10000)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++){
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}