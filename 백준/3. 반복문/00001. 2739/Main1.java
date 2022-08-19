import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수: 100,000,000
		//데이터 크기 : 9
		//선택한 시간복잡도 : n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.valueOf(br.readLine());
		
		
		for(int i=1; i<=9; i++)
			System.out.printf("%d * %d = %d%n", a, i, a * i);
	}
}