import java.util.Scanner;



class Main1 {
	
	public int Solution(String str, char t){
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == t) answer++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(T.Solution(str, c));
	}
}