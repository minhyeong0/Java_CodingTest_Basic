package debugTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Debug {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine() + " ";
		b = b.replace("#", "1").replace("*", "0");
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=a; i++){
			sb.append((char)(Integer.parseInt(b.substring(0, 8))));
			b = b.substring(8);
		}
		
	}
}