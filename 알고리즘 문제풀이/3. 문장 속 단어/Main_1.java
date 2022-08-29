import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main_1{
	public String Solution(String str){
		String answer = "";
		String[] strArr = str.split(" ");
		
		int maxlen = 0;
		
		for(int i=0; i<strArr.length; i++){
			if(strArr[i].length() > maxlen){
				maxlen = strArr[i].length();
				answer = strArr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException{
		Main_1 T = new Main_1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.Solution(str));
	}
}