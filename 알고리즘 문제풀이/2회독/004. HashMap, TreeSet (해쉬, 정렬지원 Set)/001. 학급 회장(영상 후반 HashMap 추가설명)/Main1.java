import java.util.*;



class Main1 {
	
	public char solution(int n, String s) {
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray())
			map.put(x, map.getOrDefault(x, 0) + 1);
		
		for(char x : map.keySet()){
			if(map.get(x) > max){
				max = map.get(x);
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
}