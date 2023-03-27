import java.util.*;




class Main_2 {
	
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		
		for(int x : arr) {
			int tmp = -1;
			for(int i=0; i<s; i++){
				if(answer[i] == x){
					tmp = i;
					break;
				}
			}
			if(tmp == -1){
				for(int i=s-1; i>=1; i--){
					answer[i] = answer[i-1];
				}
			} else {
				for(int i=tmp; i>=1; i--){
					answer[i] = answer[i-1];
				}
			}
			answer[0] = x;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		for(int x : T.solution(s, n, arr))
			System.out.print(x + " ");
	}
}