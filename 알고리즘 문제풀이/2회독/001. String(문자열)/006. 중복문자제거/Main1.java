import java.util.*;


class Main1 {
	
	public String solution(String str){
		String answer = "";
		ArrayList<Character> arr = new ArrayList<>();
		for(char x : str.toCharArray()){
			boolean ch = true;
			for(int i=arr.size() - 1; i>=0; i--){
				if(arr.get(i) == x){
					ch = false;
					break;
				} 
			}
			if(ch) arr.add(x);
		}
		for(char x : arr) answer += x;
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}