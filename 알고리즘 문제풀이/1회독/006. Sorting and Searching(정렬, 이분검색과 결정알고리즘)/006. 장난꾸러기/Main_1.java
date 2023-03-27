import java.util.*;





class Main_1 {
	
	public String solution(int n, int[] arr) {
		String answer = "";
		int[] sortArr = new int[n];
		for(int i=0; i<n; i++)
			sortArr[i] = arr[i];
		Arrays.sort(sortArr);
		
		int cnt = 0;
		for(int i=0; i<n; i++){
			if(arr[i] != sortArr[i]){
				if(cnt == 0){
					answer += String.valueOf(i+1) + " ";
					cnt++;
				} else {
					answer += String.valueOf(i+1);
				}
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, arr));
	}
}