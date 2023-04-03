import java.util.*;



class Main2 {
	public String solution(int n, int[] arr) {
		String answer = "";
		int tmp = 0, cnt = 0;
		boolean flag1 = false, flag2 = false;
		
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if(arr[j] > arr[i]) {
					cnt++;
					flag1 = true;
				}
			}
			if(flag1) {
				tmp = i - cnt;
				answer += (tmp + 1);
				break;
			}
		}
		
		for (int i = tmp + 1; i < n; i++) {
			if(arr[i] > arr[tmp]) {
				flag2 = true;
				answer += " " + i;
				break;
			}
		}
		if(!flag2) answer += " " + n;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print(T.solution(n, arr));
	}
}