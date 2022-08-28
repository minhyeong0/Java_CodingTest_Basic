import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int[] num = new int[10];
		String res = String.valueOf(a * b * c);
		
		for(int i=0; i<res.length(); i++){
			num[Integer.parseInt(String.valueOf(res.charAt(i)))]++;
		}
		
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
		
		
	}
}