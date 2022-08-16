import java.util.Scanner;


class LastNElements{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // 입력받은 값을 저장
		int cnt = 0;          // 입력받은 개수
		int retry;
		
		System.out.println("정수를 입력하세요.");
		
		do{
			System.out.printf("%d번째 정수: ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();
			
			System.out.print("계속 할까요? (예.1/아니요.0): ");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		// cnt 값이 배열의 크기보다 크면 배열에서 cnt값 뺀 index부터 출력 
		int i = cnt - N;
		
		//cnt가 배열의 크기보다 작으면 0부터 출력
		if(i < 0) i = 0;
		
		for(; i<cnt; i++)
			System.out.printf("%2d번째 정수 = %d\n", i + 1, a[i % N]);
	}
}