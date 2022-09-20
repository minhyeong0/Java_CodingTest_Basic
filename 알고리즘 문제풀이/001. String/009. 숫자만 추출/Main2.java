import java.util.Scanner;




class Main2{
	public int Solution(String s){
		String answer = "";
	
		for(char x : s.toCharArray()){
			if(Character.isDigit(x)){
				answer += x;
			}
		}

		return Integer.parseInt(answer);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}