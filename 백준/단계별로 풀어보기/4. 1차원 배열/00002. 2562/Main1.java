import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터 크기 : 9
		//사용한 시간복잡도 : n (9)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i=1; i<=9; i++){
			int a = Integer.parseInt(br.readLine());
			if(max < a){
				max = a;
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex);
		
		
	}
}