import java.util.Scanner;




class Main1{
	
	public String Solution(String str){
		String answer = "";
		
		for(int i=0; i<str.length(); i++){
			if(i == str.indexOf(str.charAt(i))){
				answer += str.charAt(i);
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