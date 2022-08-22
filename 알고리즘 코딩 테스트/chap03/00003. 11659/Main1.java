import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	//연산횟수 : 50,000,000
	//데이터 크기 : 100,000
	//사용한 시간복잡도 : n
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int c[] = new int[a];
		c[0] = Integer.parseInt(st2.nextToken());
		
		for(int i=1; i<a; i++){
			c[i] = c[i-1] + Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<b; i++){
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st3.nextToken()) - 1;
			int e = Integer.parseInt(st3.nextToken()) - 1;
			
			if( d== 0){
				System.out.println(c[e]);
			}else{
				System.out.println(c[e] - c[d - 1]);
			}
		}
	}
}