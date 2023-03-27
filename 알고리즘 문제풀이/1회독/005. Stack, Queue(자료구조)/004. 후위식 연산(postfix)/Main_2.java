import java.util.*;



class Main_2 {
	
	public int Solution(String str){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()){
			if(Character.isDigit(x))
				stack.push((int)(x - '0'));
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
		answer = stack.pop();
		return answer;
	}
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}