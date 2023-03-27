import java.util.*;


class Main_1 {
	
	public int solution(int n, int[] arr) {
		int answer = 0;
		boolean ch = true;
		for(int x : arr){
			if(x == 1) 
				ch = false;
			for(int i=2; i<x; i++){
				if(x % i == 0){
					ch = false;
					break;
				} else{
					ch = true;
				}
			}
			if(ch) answer++;
			ch = true;
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