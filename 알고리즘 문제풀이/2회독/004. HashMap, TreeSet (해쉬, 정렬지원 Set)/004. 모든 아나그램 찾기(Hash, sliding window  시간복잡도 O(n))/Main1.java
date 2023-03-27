import java.util.*;



class Main1 {
	public int solution(String s, String t) {
		int answer = 0, lt = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < t.length() - 1; i++) 
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		
		for (int i = t.length() - 1; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			boolean flag = true;
			for (char x : map.keySet()) {
				int cnt = 0;
				for(char tmp : t.toCharArray())
					if(tmp == x) cnt++;
				if(cnt != map.get(x)) {
					flag = false;
					break;
				}
			}
			if(flag) answer++;
			map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(T.solution(s, t));
	}
}