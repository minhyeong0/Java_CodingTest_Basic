import java.util.*;




class Main_1 {
	public int Solution(int n, int m, int[] a){
		int answer = 0;
		for(int i=0; i<n; i++){
			int sum = 0;
			boolean sw = true;
			for(int j=0; j<m; j++){
				if(j+i >= n){
					sw = false;
					break;
				}
				sum += a[j+i];
			}
			if(sw){
				if(sum > answer) answer = sum;
			}

		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println(T.Solution(n, m, a));
	}
}