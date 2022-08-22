import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	//연산횟수 : 10,000,000
	//데이터 크기 : 3,000,000
	//사용한 시간복잡도 : n
	
	long sum(int[] a){
		long sum = 0;
		
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		
		for(int i=0; i<a; i++){
			b[i] = Integer.parseInt(br.readLine());
		}
		
		Main1 m = new Main1();
		
		long sum = m.sum(b);
		
		System.out.println(sum);
	}
}