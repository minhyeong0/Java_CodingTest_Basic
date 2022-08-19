import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산횟수 : 100,000,000
		//데이터 크기 : 1
		//사용한 시간복잡도 : n
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i=1; i<=a; i++) sum += i;
		
		System.out.println(sum);
		
	}
}