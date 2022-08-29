import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine().replaceAll("[^0-9]", "");
		System.out.println(Integer.parseInt(a));
	}
}