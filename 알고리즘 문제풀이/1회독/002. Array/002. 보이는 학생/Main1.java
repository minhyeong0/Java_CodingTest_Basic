import java.util.Scanner;




class Main1{
	
	public int Solution(int n, int[] arr){
		int answer = 1;
		int max = arr[0];
		
		for(int i=1; i<n; i++){
			if(arr[i] > max){
				answer++;
				max = arr[i];
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, arr));
	}
}