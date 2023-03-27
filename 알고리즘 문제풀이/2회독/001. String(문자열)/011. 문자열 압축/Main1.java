import java.util.*;




class Main1 {
	
	public String solution(String s){
		String answer = "";
		int cnt = 0;
		char tmp = s.charAt(0);
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == tmp){
				cnt++;
			} else {
				answer += tmp;
				if(cnt != 1) answer += cnt;
				tmp = s.charAt(i);
				cnt = 1;
			}
		}
		answer += tmp;
		if(cnt != 1) answer += cnt;
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}