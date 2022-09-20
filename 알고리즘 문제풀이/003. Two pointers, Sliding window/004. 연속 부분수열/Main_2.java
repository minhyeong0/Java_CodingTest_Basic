import java.util.*;
import java.io.*;


class Main_2 {
	
	public int Solution(int n, int k, int[] arr) {
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
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, m, arr));
	}
}