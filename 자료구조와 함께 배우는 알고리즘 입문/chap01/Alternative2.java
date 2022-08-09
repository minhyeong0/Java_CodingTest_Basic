import java.util.Scanner;


class Alternative2{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		
		do{
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		//n이 홀수이면 7/2 = 3
		for(int i=0; i<n/2; i++){
			System.out.print("+-");
		}
		
		//n이 홀수 일때만 마지막에 한번더 출력
		if(n % 2 != 0) 
			System.out.print("+");
	}
}