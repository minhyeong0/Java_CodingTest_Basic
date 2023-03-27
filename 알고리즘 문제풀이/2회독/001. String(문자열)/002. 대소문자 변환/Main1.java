import java.util.*;



class Main1 {
	//65 ~ 90 : 대문자, 97 ~ 122 소문자, 48 ~ 57 숫자
	public String solution(String str){
		String answer = "";
		for(char x :str.toCharArray()){
			if(97 <= x && x <= 122)
				answer += (char)(x - 32);
			else
				answer += (char)(x + 32);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}