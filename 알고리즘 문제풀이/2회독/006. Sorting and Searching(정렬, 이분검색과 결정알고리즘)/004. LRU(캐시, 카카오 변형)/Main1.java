import java.util.*;



class Main1 {
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		for (int x : arr) {
			boolean flag = true;
			for (int i = 0; i < s; i++) {
				if(answer[i] == x) {
					int tmp = x;
					for (int j = i - 1; j >= 0; j--)
						answer[j+1] = answer[j];
					answer[0] = tmp;
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int i = s - 1; i >= 1; i--)
					answer[i] = answer[i-1];
				answer[0] = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T  = new Main1();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int x : T.solution(s, n, arr))
			System.out.print(x + " ");
	}
}