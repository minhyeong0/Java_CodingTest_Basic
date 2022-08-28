import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산횟수 : 100,000,000
		//데이터크기 : 1,000,000
		//사용한 시간복잡도 : n (1,000,000)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<a; i++){
			int b = Integer.parseInt(st.nextToken());
			if(max < b) max = b;
			if(min > b) min = b;
		}
		
		System.out.println(min + " " + max);
	}
}