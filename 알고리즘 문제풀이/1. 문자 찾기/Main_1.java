import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main_1{
	
	static int Solution(String a, String b){
		int answer = 0;
		
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i) == b.charAt(0)) answer++;
		}

		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine().toUpperCase();
		String b = br.readLine().toUpperCase();
		
		System.out.println(Solution(a, b));
		
	}
}