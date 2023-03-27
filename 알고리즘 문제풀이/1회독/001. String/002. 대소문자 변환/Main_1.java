import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main_1{
	
	public String Solution(String str){
		String answer = "";
		
		char[] strArr = str.toCharArray();
		
		for(int i=0; i<strArr.length; i++){
			if('a'<= strArr[i] && strArr[i] <= 'z'){
				strArr[i] = Character.toUpperCase(strArr[i]);
			}else{
				strArr[i] = Character.toLowerCase(strArr[i]);
			}
		}
		answer = String.valueOf(strArr);
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		Main_1 T = new Main_1();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(T.Solution(str));
	}
}