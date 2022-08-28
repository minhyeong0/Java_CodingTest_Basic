import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		//100미만의 수는 등차수열임
		int count = 99;
		
		for(int i=100; i<=a; i++){
			int tmp = i;
			
			int p100 = tmp / 100;
			tmp = tmp % 100;
			
			int p10 = tmp / 10;
			tmp = tmp % 10;
			
			int p = tmp % 10;
			
			int res1 = Math.abs(p100 - p10);
			int res2 = Math.abs(p10 - p);
			
			if(!(p100 == p && p100 != p10)){
				if(res1 == res2) count++;
			}
			
		}
		
		if(a < 100) count = a;
		
		System.out.println(count);
	}
}