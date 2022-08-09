import java.util.Scanner;

class Median{
	static int med3(int a, int b, int c){
		//a>=b
		if(a >= b)
			//a>=b>=c
			if(b >= c)
				return b;
			//c>=a>=b
			else if (a <= c)
				return a;
			//a>=c>=b
			else
				return c;
		//a<b
		else if(a > c)
			//c<a<b
			return a;
		else if(b > c)
			// a<c<b
			return c;
		else
			//a<b<=c
			return b;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}