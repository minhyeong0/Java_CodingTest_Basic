import java.util.*;



class Main3 {
	
	public void solution(int n){
		int a = 1, b = 1, c = 0;
		System.out.print(a + " " + b + " ");
		for(int i=2; i<n; i++){
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args){
		Main3 T = new Main3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.solution(n);
	}
}