import java.util.*;



class Main_1 {
	
	public char Solution(int n, String str){
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray())
			map.put(x, map.getOrDefault(x, 0) + 1);
		
		int max = 0;
		
		for(char x : map.keySet()){
			if(map.get(x) > max){
				max = map.get(x);
				answer = x;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.Solution(n, str));
	}
}