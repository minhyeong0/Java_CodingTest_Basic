import java.util.*;


class Main1 {
	public int solution(String str) {
		int answer = 0, pre = 0, post = 0;
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(48 <= x && x <= 57) {
				stack.push((int)(x-48));
				continue;
			}
			post = stack.pop();
			pre = stack.pop();
			if(x == '+')
				stack.push(pre + post);
			else if(x == '-')
				stack.push(pre - post);
			else if(x == '*')
				stack.push(pre * post);
			else
				stack.push(pre / post);
		}
		answer = stack.pop();
			
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}