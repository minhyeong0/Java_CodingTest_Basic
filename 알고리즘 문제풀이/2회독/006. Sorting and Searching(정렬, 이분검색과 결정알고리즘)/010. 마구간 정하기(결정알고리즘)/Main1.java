import java.util.*;



class Main1 {
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int mid, lt = 1, rt = arr[n-1];
		
		while (lt <= rt) {
			mid = (lt + rt) / 2;
			int cnt = 1, pos = arr[0];
			for (int i = 1; i < n; i++) {
				if (arr[i] - pos >= mid) {
					pos = arr[i];
					cnt++;
				}
			}
			if (cnt >= c) {
				answer = mid;
				lt = mid + 1;
			} else
				rt = mid - 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}