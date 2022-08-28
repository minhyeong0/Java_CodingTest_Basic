import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터 크기 : ??
		//사용한 시간복잡도 : n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			try{
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a + b);
			}catch(Exception e){
				break;
			}

		}
	}
}