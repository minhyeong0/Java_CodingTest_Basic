import java.util.Scanner;




class Main1{
	public String Solution(String str){
		String answer = "";
		
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)){
				answer += Character.toUpperCase(x);
			}else{
				answer += Character.toLowerCase(x);
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}