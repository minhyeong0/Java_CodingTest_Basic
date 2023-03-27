import java.util.*;




class Main_2 {
	
	public String solution(String a, String b){
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : a.toCharArray())
			Q.offer(x);
		
		
		for(char x : b.toCharArray()) {
			if(Q.contains(x))
				if(Q.poll() != x)
					return "NO";
		}
		
		if(!Q.isEmpty())
			return "NO";
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
	}
}