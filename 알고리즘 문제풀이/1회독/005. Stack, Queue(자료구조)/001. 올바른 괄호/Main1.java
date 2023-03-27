import java.util.*;




class Main1 {
	
	public String Solution(String str){
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(x == '(')
				stack.push(x);
			else{
				if(stack.isEmpty())
					return "NO";
				else
					stack.pop();
			}
		}
		
		if(!stack.isEmpty())
			return "NO";
		
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}