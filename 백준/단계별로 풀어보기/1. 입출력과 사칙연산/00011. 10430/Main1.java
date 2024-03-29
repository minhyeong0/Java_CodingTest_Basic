import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf((a + b) % c));
		bw.newLine();
		
		bw.write(String.valueOf(((a % c) + (b % c)) % c));
		bw.newLine();
		
		bw.write(String.valueOf((a * b) % c));
		bw.newLine();
		
		bw.write(String.valueOf(((a % c) * (b % c)) % c));
		bw.newLine();
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}