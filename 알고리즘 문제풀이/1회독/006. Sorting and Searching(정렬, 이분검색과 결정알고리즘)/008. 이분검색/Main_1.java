import java.util.*;




class Main_1 {
	
	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		Arrays.sort(arr);
		int lt = 0;
		int rt = n-1;

		while(lt <= rt){
			int mid = (lt + rt) / 2;
			if(m == arr[mid])
				return mid + 1;
			else if(arr[mid] < m)
				lt = mid + 1;
			else 
				rt = mid - 1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}