import java.util.*;



class Main_1 {
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];	
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++){
				if(arr[j] < arr[i]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}		
			}
			answer[i] = arr[i];
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
		for(int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}