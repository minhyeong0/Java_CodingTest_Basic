import java.util.*;



class Main1 {
	static int n, m;
	static int[] dy;
	
	public int solution(int[] coin){
		Arrays.fill(dy, 2000000000);
		dy[0] = 0;
		for(int i=0; i<n; i++){
			for(int j=coin[i]; j<=m; j++){
				dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
			}
		}
		return dy[m];
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		m = sc.nextInt();
		dy = new int[m+1];
		System.out.println(T.solution(arr));
	}
}