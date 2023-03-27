import java.util.*;



class Main1 {	
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(')
				stack.push(x);
			else if(x == ')')
				stack.pop();
			else
				if(stack.isEmpty()) answer += x;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}