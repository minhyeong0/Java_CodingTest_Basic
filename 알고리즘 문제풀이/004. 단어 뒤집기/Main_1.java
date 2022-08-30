import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




class Main_1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++){
			char[] b = br.readLine().toCharArray();
			
			for(int j=0; j<b.length / 2; j++){
				char tmp = b[j];
				b[j] = b[b.length - 1 - j];
				b[b.length -1 - j] = tmp;
			}
			
			System.out.println(String.valueOf(b));
		}
	}
}