import java.util.Scanner;
import java.util.ArrayList;



class Main1{
	
	public ArrayList<String> Solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str){
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}
		
		for(String x : T.Solution(n, str)){
			System.out.println(x);
		}
	}
}