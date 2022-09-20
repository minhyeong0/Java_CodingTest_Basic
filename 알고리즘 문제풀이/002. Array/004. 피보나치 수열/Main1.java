import java.util.Scanner;





class Main1{
	public int[] Solution(int n){
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i=2; i<n; i++){
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x : T.Solution(n)){
			System.out.print(x + " ");
		}
	}
}