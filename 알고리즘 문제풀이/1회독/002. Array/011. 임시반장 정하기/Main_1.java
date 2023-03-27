import java.util.Scanner;






class Main_1 {
	
	public int Solution(int n, int[][] arr){
		int answer = 1;
		int max = 0;
		
		for(int i=0; i<n; i++){
			int sum = -n;
			for(int j=0; j<n; j++){
				for(int k=0; k<5; k++){
					if(arr[i][j] == arr[k][j]){
						sum++;
						break;
					}
				}
			}
			if(sum > max){
				max = sum;
				answer = i+1;
			} 
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.Solution(n, arr));
	}
}