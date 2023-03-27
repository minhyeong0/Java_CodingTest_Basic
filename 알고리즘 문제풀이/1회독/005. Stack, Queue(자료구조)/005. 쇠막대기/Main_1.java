import java.util.*;



class Main_1 {
	
	public int Solution(String str){
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '(')
				stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(')
					answer += stack.size();
				else
					answer += 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}