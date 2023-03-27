import java.util.*;




class Main1 {
	
	public int Solution(String str){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(Character.isDigit(x))
				stack.push((int)(x - 48));
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				
				if(x == '+')
					stack.push(lt + rt);
				else if(x == '-')
					stack.push(lt - rt);
				else if(x == '*')
					stack.push(lt * rt);
				else
					stack.push(lt / rt);
			}
		}
		answer = stack.get(0);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}