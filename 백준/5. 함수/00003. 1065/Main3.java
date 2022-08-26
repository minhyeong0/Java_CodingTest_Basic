import java.util.Scanner;




class Main3{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 99;
		
		if(N < 100){
			ans = N;
		}else{
			for(int i= 100; i<=N; i++){
				int a = i / 100; //100의 자리
				int b = i % 100 / 10 * 2; //10의 자리에 2를 곱한 값
				int c = i % 10; //1의 자리
				
				if(b == a + c) ans++;
			}
		}
		System.out.println(ans);
	}
}