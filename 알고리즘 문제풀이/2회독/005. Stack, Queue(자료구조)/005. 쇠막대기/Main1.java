import java.util.*;



class Main1 {
	public int solution(String str) {
		int answer = 0;
		char pre = ' ';
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
				pre = x;
			} else {
				if(pre == '(') {
					stack.pop();
					answer += stack.size();
					pre = x;
				} else {
					stack.pop();
					answer++;
				}
			}
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