import java.util.*;



class Main1 {
	
	public String Solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : need.toCharArray()) Q.offer(x);
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x))
				if(x != Q.poll()) return "NO";
		}
		
		if(!Q.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.Solution(a, b));
	}
}