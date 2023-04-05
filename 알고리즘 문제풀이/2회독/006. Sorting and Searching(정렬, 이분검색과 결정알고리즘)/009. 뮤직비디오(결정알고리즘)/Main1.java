import java.util.*;



class Main1 {	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = 1, rt = Arrays.stream(arr).sum();
		
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			int cnt = 1, tmp = 0;
			for (int i = 0; i < n; i++) {
				if(tmp + arr[i] <= mid) {
					tmp += arr[i];
				} else {
					tmp = arr[i];
					cnt++;
				}
			}
			if (cnt <= m) {
				answer = mid;
				rt = mid - 1;
			} else
				lt = mid + 1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}