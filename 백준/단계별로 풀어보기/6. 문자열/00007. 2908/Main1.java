import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main1{
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int chA = 0;
		int chB = 0;
		
		for(int i=2; i>=0; i--){
			chA += (a % 10) * Math.pow(10, i);
			a = a / 10;
			
			chB += (b % 10) * Math.pow(10, i);
			b = b / 10;
		}

		if(chA >= chB){
			System.out.println(chA);
		}else{
			System.out.println(chB);
		}

	}
}