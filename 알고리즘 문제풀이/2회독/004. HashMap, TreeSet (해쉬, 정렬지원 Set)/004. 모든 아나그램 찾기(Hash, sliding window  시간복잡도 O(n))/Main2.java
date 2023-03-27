import java.util.*;


class Main2 {
	
	public int solution(String s, String t) {
		int answer = 0, lt = 0;
		HashMap<Character, Integer> sm = new HashMap<>();
		HashMap<Character, Integer> tm = new HashMap<>();
		
		for (int i = 0; i < t.length() - 1; i++)
			sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
		
		for (char x : t.toCharArray())
			tm.put(x, tm.getOrDefault(x, 0) + 1);
		
		for (int rt = t.length() - 1; rt < s.length(); rt++) {
			sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
			if(sm.equals(tm)) answer++;
			sm.put(s.charAt(lt), sm.get(s.charAt(lt)) - 1);
			if(sm.get(s.charAt(lt)) == 0) sm.remove(s.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(T.solution(s, t));
	}
}