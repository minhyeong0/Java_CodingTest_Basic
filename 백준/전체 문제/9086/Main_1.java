import java.util.*;





class Main_1 {
	
	public String[] solution(int n, String[] arr){
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++){
			answer[i] = "";
			answer[i] += arr[i].charAt(0);
			answer[i] += arr[i].charAt(arr[i].length()-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.next();
		for(String x : T.solution(n, arr))
			System.out.println(x);
	}
}