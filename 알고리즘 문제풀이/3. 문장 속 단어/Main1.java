import java.util.Scanner;



class Main1{
	public String Solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(String x : s){
			int len = x.length();
			if(len > m){
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.Solution(str));
	}
}