import java.util.Scanner;



class Main2{
	public int Solution(String str, char t){
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(char x : str.toCharArray()){
			if(x == t) answer ++; 
		}
	
		return answer;
	}
	
	
	public static void main(String[] args){
		Main2 T = new Main2();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(T.Solution(str, c));
	}
}
