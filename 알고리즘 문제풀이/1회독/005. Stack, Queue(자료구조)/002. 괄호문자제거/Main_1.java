import java.util.*;



class Main_1 {
	
	public ArrayList<Character> Solution(String str){
		ArrayList<Character> answer = new ArrayList<>();
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(x == '(')
				stack.push(x);
			else if(x == ')')
				stack.pop();
			else {
				if(stack.isEmpty())
					answer.add(x);
			}
		}
			
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(char x : T.Solution(str))
			System.out.print(x);
	}
}