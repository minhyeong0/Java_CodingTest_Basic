import java.util.*;




class Main_1 {
	
	public int Solution(String str){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(Character.isDigit(x))
				stack.push((int)(x - '0'));
			else {
				int a = stack.pop();
				int b = stack.pop();
				
				if(x == '+')
					stack.push(b + a);
				else if(x == '-')
					stack.push(b - a);
				else if(x == '*')
					stack.push(b * a);
				else
					stack.push(b / a);	
			}
		}
		answer = stack.get(0);
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}