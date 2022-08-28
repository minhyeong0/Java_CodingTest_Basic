import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main1{
	
	//연산횟수 : 100,000,000
	//데이터 크기 : 80 ??
	//사용한 시간복잡도 : n^2
	
	public static void main(String[] args) throws IOException{
		//1. 테스트케이스 개수를 받는다.
		//2. 테스트케이스 개수만큼 각각의 ox 문자열을 받는다
		//3. ox 문자열을 char배열 형태로 바꾼다.
		//4. 각각의 문자열의 해당하는 sum과 count 변수를 만든다.
		//5. o가 연속적으로 나올때마다 count를 1씩증가시킨다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<a; i++){
			String b = br.readLine();
			char[] c = b.toCharArray();
			
			int sum = 0;
			int count = 0;
			
			for(int j=0; j<c.length; j++){
				if(c[j] == 'O'){
					count++;
					sum += count;
				}else if (c[j] == 'X'){
					count = 0;
				} 
			}
			System.out.println(sum);
		}
	}
}