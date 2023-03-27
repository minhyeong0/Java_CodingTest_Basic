import java.util.*;



class Main_1 {
	
	public int solution(int n){
		int answer = 0;
		
		for(int i=1; i<n; i++){
			int tmp = i;
			int num = i;
			while(num > 0){
				tmp += num % 10;
				num /= 10;
			}
			if(tmp == n) return i;
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}