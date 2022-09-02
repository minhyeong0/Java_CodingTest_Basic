import java.util.Scanner;



class Main_1 {
	
	public int[] Solution(int n, int[] arr){
		int[] answer = new int[n];
		for(int i=0; i<n; i++){
			int count = -1;
			for(int j=0; j<n; j++){
				if(arr[j] <= arr[i]){
					count++;
				}
			}
			answer[i] = n - count;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, arr)){
			System.out.print(x + " ");
		}
	}
}