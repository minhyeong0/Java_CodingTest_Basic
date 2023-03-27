import java.util.*;



class Main_1 {
	
	public int solution(int n){
		int[] arr = new int[n+2];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<=n+1; i++)
			arr[i] = arr[i-2] + arr[i-1];
		return arr[n+1];
	}
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}