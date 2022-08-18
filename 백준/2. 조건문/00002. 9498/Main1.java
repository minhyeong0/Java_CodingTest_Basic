import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


class Main1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		if(input >= 90)      bw.write("A\n");
		else if(input >= 80) bw.write("B\n");
		else if(input >= 70) bw.write("C\n");
		else if(input >= 60) bw.write("D\n");
		else                 bw.write("F\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}