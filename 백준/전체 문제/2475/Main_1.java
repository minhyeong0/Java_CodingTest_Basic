import java.util.*;





class Main_1 {
	
	public int solution(int[] arr){
		int answer = 0;
		
		for(int x : arr){
			answer += Math.pow(x, 2);
		}
		answer %= 10;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(arr));
	}
}