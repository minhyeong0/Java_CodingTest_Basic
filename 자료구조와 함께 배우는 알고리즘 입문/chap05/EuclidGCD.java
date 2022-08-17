import java.util.Scanner;


class EuclidGCD{
	
	static int gcd(int x, int y){
		
		//y가 0일때 최대공약수는 x임
		if(y == 0)
			return x;
		else
			return gcd(y, x % y);		
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합시다.");
		
		System.out.print("정수를 입력하세요.: ");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요.: ");
		int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
}