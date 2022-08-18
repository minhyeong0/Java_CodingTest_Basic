import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int[] originArr = {1, 1, 2, 2, 2, 8};
		String[] resultArr = new String[6];
		
		int i = 0;
		while(st.hasMoreTokens()){
			resultArr[i] =  String.valueOf(originArr[i] - Integer.parseInt(st.nextToken()));
			i++;
		}
		
		System.out.println(String.join(" ", resultArr));
	}
}