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
		
		if(input % 4 == 0 && input % 100 != 0 || input % 400 == 0){
			bw.write("1\n");
		}else{
			bw.write("0\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}