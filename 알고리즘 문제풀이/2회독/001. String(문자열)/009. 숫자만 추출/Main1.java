import java.util.*;



class Main1 {
	
	public int solution(String s){
		int answer = 0;
		for(char x : s.toCharArray()){
			if(48<= x && x <= 57)
				answer = (answer * 10) + (x - 48);
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