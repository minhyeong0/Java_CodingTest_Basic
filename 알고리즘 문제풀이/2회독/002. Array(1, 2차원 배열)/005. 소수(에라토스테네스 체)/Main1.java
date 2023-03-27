import java.util.*;



class Main1 {
	
	public int solution(int n){
		int answer = 0;
		boolean[] num = new boolean[n+1];
		for(int i=2; i<=n; i++){
			if(num[i] == false){
				for(int j=i*2; j<=n; j+=i)
					num[j] = true;
			}
		}
		
		for(int i=2; i<=n; i++)
			if(num[i] == false) answer++;
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}