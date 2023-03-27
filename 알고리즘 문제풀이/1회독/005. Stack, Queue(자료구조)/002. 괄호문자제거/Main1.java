import java.util.*;




class Main1 {
	
	public String Solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(x == ')'){
				while(stack.pop() != '(');
			} else
				stack.push(x);
		}
		
		for(int i=0; i<stack.size(); i++)
			answer += stack.get(i);
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}