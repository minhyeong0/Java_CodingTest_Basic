import java.util.*;



class Main1 {
	public String solution(String a, String b) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for (char x : a.toCharArray()) queue.offer(x);
		
		for (char x : b.toCharArray()) {
			if(queue.isEmpty()) return "YES";
			if(x == queue.peek()) queue.poll();
		}
		if(!queue.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
	}
}