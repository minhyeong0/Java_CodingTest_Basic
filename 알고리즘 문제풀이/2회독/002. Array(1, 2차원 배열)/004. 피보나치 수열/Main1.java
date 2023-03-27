import java.util.*;



class Main1 {
	
	public int[] solution(int n){
		int[] answer = new int[n];
		int a = 1, b = 1;
		answer[0] = a;
		answer[1] = b;
		for(int i=2; i<n; i++){
			answer[i] = a + b;
			a = b;
			b = answer[i];
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x : T.solution(n))
			System.out.print(x + " ");
	}
}