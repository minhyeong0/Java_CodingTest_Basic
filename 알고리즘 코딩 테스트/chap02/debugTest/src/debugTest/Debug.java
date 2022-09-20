public class Debug {
	int solution(int n, int k, int[] arr) {
		int sum = 0;
		int cnt = 0;
		int idx = 0;
		int startP = 0;

		while (idx < n) {
			sum += arr[idx];
			if (sum < k) {
				idx++;
			} else {
				if (sum == k)
					cnt++;
				sum = 0;
				startP++;
				idx = startP;
			}
		}
		return cnt;
	}
}