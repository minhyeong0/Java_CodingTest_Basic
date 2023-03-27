import java.util.*;



class Main1 {
	
	public String solution(int n, String s){
		String answer = "";
		s = s.replace('#', '1').replace('*', '0');
		for(int i=0; i<n; i++){
			String tmp = s.substring(0, 7);
			answer += (char)(Integer.parseInt(tmp, 2));
			s = s.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
}