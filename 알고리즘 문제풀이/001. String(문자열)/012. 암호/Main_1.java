import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine() + " ";
		b = b.replace("#", "1").replace("*", "0");
		
		for(int i=0; i<a; i++){
			System.out.print((char)Integer.parseInt(b.substring(0, 7), 2));
			b = b.substring(7);
		}
	}
}