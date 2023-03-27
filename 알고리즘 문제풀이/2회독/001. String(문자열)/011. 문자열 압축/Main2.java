import java.util.*;



class Main2 {
	
	public String solution(String s){
		String answer = "";
		s += " ";
		int cnt = 1;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)) cnt++;
			else {
				answer += s.charAt(i);
				if(cnt > 1) answer += Integer.toString(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}