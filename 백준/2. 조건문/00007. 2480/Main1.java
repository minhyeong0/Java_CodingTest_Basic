import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a >= b){
			if(a > b){
				if(a >= c){
					if(a > c){
						//a > c, a > b
						if(b >= c){
							if(b > c){
								//c < b < a
								System.out.println(a * 100);
							}else{
								//b = c < a
								System.out.println(1000 + b * 100);
							}
						}else{
							//b < c < a
							System.out.println(a * 100);
						}
					}else{
						//b < a = c
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
						//c < a = b
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
				//a < c, a < b
				if(b >= c){
					if(b > c){
						//a < c < b
						System.out.println(b * 100);
					}else{
						//a < b = c
						System.out.println(1000 + b * 100);
					}
				}else{
					//a < b < c
					System.out.println(c * 100);
				}
			}
		}
	}
}