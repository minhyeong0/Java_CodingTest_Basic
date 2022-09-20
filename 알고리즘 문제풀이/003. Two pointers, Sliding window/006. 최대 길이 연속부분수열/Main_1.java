import java.util.*;




class Main_1 {
	
	public int Solution(int n, int k, int[] arr){
		int answer = 0, lt = 0, tmp = 0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt] == 0) tmp++;
			while(tmp > k){
				if(arr[lt++] == 0) tmp--;
			}
			if(tmp == k){
				answer = Math.max(answer, (rt - lt + 1));
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, k, arr));
	}
}