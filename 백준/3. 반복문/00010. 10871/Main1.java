import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산 횟수 : 100,000,000
		//데이터 크기 : 10,000
		//사용한 시간복잡도 : n (10000)
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<a; i++){
			int c = Integer.parseInt(st2.nextToken());
			if(b > c){
				sb.append(c + " ");
			}
		}
		
		System.out.println(sb);
	}
}