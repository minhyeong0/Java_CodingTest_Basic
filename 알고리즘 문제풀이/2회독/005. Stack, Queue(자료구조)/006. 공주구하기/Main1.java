import java.util.*;



class Main1 {
	public int solution(int n, int k) {
		int answer = 0, cnt = 0, num = 0;
		boolean flag = true;
		int[] a = new int[n+1];
		
		while (flag) {
			for (int i = 1; i <= n; i++) {
				if(a[i] == 0) {
					cnt++;
					if(cnt == k) {
						cnt = 0;
						a[i] = 1;
						num++;
						if(num == n - 1) {
							flag = false;
							break;
						}
					}
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if(a[i] == 0) {
				answer = i;
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
	}
}