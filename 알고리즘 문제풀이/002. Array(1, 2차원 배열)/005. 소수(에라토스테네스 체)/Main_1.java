import java.util.Scanner;





class Main_1{
	
	public int Solution(int n){
		int answer = 1;
			for(int i=2; i<=n; i++){
				boolean sw = false;
				for(int j=1; j*j<=i; j++){
					if(i % j != 0) sw = true;
				}
				if(sw) answer++;
			}
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.Solution(n));
		System.out.println(Math.sqrt(2));
	}
}