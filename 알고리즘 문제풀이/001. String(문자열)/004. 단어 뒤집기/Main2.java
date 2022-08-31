import java.util.Scanner;
import java.util.ArrayList;



class Main2{
	
	public ArrayList<String> Solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str){
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = s.length - 1;
			
			while(lt < rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
			
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
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