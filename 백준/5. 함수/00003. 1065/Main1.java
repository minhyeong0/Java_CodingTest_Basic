import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



class Main1{
	
	public static void main(String[] args) throws IOException{
		
		//1. 숫자를 입력받는다.
		//2. 1부터 입력받은 숫자까지 한수가 있는지 체크하고 개수가 몇개인지를 출력한다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=1; i<=a; i++){
			int tmp = i;
			int p1000 = tmp / 1000;
			tmp = tmp % 1000;
			
			int p100 = tmp / 100;
			tmp = tmp % 100;
			
			int p10 = tmp / 10;
			tmp = tmp % 10;
			
			int p1 = tmp % 10;
			
			if(Math.abs(p1000 - p100) == Math.abs(p100 - p10)){
				if(Math.abs(p10) == Math.abs(p1)){
					
				}
			}
		}
		
		System.out.println(count);
	}
}