import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	//연산 횟수 : 200,000,000
	//데이터 크기 : 1000
	//사용한 시간복잡도 : n
	
	public static void main(String[] args) throws IOException{
		//1. 과목수와 과목점수를 입력을 받는다.	
		//2. 최대값을 찾는다.
		//3. 기존점수를 점수/최댓값 *100으로 고친다
		//4. 새로운 점수로 평균을 구한다.
		
		
		//toCharArray는 Wrapper 클래스다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double avg = 0;
		int max = 0;
		int sum = 0;
		
		
		for(int i=0; i<a; i++){
			int b = Integer.parseInt(st.nextToken());
			sum += b;
			if(b > max) max = b;
		}
		
		avg = (sum * 100.0 / max) / a;
		
		System.out.println(avg);
	}
}