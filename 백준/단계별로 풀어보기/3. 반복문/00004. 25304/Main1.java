import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산횟수 : 100,000,000
		//데이터 크기 : 100
		//사용한 시간복잡도 : n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i=0; i<b; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			sum += c * d;
		}
		System.out.println(a == sum ? "Yes" : "No");
	}
}