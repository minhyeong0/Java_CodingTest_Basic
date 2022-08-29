import java.util.Scanner;




class Main1{
	public int Solution(String s){
		int answer = 0;
	
		for(char x : s.toCharArray()){
			//아스키코드 : 0(48) ~ 9(57) 
			if(48<= x && x <= 57){
				answer = answer * 10 + (x - 48);
			}
		}

		return answer;
	}
	
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}