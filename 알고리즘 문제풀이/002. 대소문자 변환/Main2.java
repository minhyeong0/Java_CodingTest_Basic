import java.util.Scanner;




class Main2{
	public String Solution(String str){
		String answer = "";
		
		//대문자 : 65(A) ~ 90(Z)
		//소문자 : 97(a) ~ 122(z)
		//소문자에서 32를 빼면 대문자가 됨
		//대문자에서 32를 더하면 소문자가 됨
		
		for(char x : str.toCharArray()){
			if(97 <= x && x <= 122){
				answer += (char)(x - 32);
			}else{
				answer += (char)(x + 32);
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}