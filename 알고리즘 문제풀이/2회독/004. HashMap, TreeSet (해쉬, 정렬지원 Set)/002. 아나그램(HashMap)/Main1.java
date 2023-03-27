import java.util.*;



class Main1 {
	
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s1.toCharArray())
			map.put(x, map.getOrDefault(x, 0) + 1);
		for(char x : s2.toCharArray())
			map.put(x, map.getOrDefault(x, 0) - 1);
		
		for(char x : map.keySet()) {
			if(map.get(x) != 0) {
				answer = "NO";
				break;
			} 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str1, str2));
	}
}