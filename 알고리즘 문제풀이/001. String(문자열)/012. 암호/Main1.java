import java.util.Scanner;




class Main1{
	
	public String Solution(int n, String s){
		String answer = "";
		
		for(int i=0; i<n; i++){
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			s = s.substring(7);
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.Solution(n, str));
	}
}