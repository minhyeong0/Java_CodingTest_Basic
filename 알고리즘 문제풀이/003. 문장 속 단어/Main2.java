import java.util.Scanner;



class Main2{
	public String Solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos = str.indexOf(' '))!= -1){
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			
			if(len > m){
				m = len;
				answer = tmp;
			}
			//공백다음부터 잘라서 저장
			str = str.substring(pos+1);
		}
		
		if(str.length() > m){
			answer = str;
		} 
		
		
		return answer;
	}
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.Solution(str));
	}
}