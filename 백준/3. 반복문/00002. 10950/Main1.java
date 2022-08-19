import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터 크기 : 10
		//사용한 시간복잡도 : 10
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.valueOf(br.readLine());
		
		for(int i=0; i<a; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			System.out.println(b + c);
		}
	}
}