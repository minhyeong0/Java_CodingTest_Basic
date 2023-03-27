import java.util.*;



class Main_1 {
	
	public String solution(int n, int[] arr) {
		for(int i=1; i<n; i++){
			for(int j=0; j<n; j++){
				if(i == j) continue;
				if(arr[i] == arr[j])
					return "D";
			}
		}
		return "U";
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, arr));
	}
}