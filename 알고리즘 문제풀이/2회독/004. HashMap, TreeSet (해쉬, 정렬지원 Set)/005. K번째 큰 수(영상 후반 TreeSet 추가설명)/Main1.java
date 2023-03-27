import java.util.*;



class Main1 {
	
	public int solution(int n, int k, int[] arr) {
		int answer = -1, cnt = 0;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		for (int x : Tset) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}