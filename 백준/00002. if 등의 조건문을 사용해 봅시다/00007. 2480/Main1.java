import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	public static void main(String[] args) throws IOException{
		
		//1. 주사위 3개를 입력받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//2. 눈이 몇개가 같은지 확인하고 크기가 큰순서대로 나열한다.
		if(a >= b){
			if(a > b){
				// a > b
				if(a >= c){
					if(a > c){
						// a > c > b
						System.out.println(a * 100);
					}else{
						// a = c > b
						System.out.println(1000 + a * 100);
					}
				}else{
					//b < a < c
					System.out.println(c * 100);
				}
			}else{
				//a = b
				if(a >= c){
					if(a > c){
						//a = b > c
						System.out.println(1000 + a * 100);
					}else{
						//a = b = c
						System.out.println(10000 + a * 1000);
					}
				}else{
					//a = b < c
					System.out.println(1000 + a * 100);
				}
			}
		}else{
			//a < b
			if(a >= c){
				if(a > c){
					//c < a < b
					System.out.println(b * 100);
				}else{
					//a = c < b
					System.out.println(1000 + a * 100);
				}
			}else{
				//a < b < c
				System.out.println(c * 100);
			}
		}
	}
}