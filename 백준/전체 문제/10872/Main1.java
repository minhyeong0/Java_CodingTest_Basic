import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int sum = 1;
		for(int i=1; i<=a; i++){
			sum *= i;
		}
		
		System.out.println(sum);
	}
}