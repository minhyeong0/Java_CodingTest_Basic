import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input);
		
		int sum = 0;
		
		while(st.hasMoreTokens()){
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
	}
}