import java.util.Scanner;



class Main_1{
	
	public int Solution(int n, int[][] arr){
		int answer = 0;
		int[] ch = new int[4];
		for(int i=0; i<n; i++)
			ch[0] += arr[i][i];
		
		for(int i=0; i<n; i++)
			ch[1] += arr[i][n-1-i];
		
		int colMax = 0;
		for(int i=0; i<n; i++){
			int tmp = 0;
			for(int j=0; j<n; j++)
				tmp += arr[i][j];
			if(tmp > colMax)
				colMax = tmp;
		}
		ch[2] = colMax;
		
		int rowMax = 0;
		for(int i=0; i<n; i++){
			int tmp = 0;
			for(int j=0; j<n; j++)
				tmp+= arr[j][i];
			if(tmp> rowMax)
				rowMax = tmp;
		}
		ch[3] = rowMax;

		for(int i=0; i<ch.length; i++){
			if(ch[i] > answer){
				answer = ch[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		System.out.println(T.Solution(n, arr));
	}
}