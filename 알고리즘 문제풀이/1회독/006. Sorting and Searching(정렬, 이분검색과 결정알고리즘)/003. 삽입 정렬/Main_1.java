import java.util.*;





class Main_1 {
	
	
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				if(arr[i] < arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		return arr;
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