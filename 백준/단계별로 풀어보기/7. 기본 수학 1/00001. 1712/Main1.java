import java.util.*;


class Main1 {
	
	public int solution(int a, int b, int c){
		int n = 1;
		
		if(c < b) return -1;
		while(c * n <= a + b * n  ){
			n++;
		}
		
		return n;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(T.solution(a, b, c));
	}
}