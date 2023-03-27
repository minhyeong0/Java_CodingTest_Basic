import java.util.*;


class Main_1 {
	
	public String Solution(String str1, String str2) {
		String answer = "NO";
		Queue<Character> queue = new LinkedList<>();
		
		for(char x : str1.toCharArray())
			for(char y :str2.toCharArray()){
				if(x == y){
					queue.offer(x);
					break;
				} 
			}
				
		
		String tmp = "";
		for(char x : queue) tmp += x;
		if(tmp.equals(str1)) return "YES";
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.Solution(str1, str2));
	}
}