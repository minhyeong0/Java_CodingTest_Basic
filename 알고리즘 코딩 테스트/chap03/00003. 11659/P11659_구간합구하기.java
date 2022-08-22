import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class P11659_구간합구하기{
	//연산횟수 : 50,000,000
	//데이터 크기 : 100,000
	//사용한 시간복잡도 : n
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int suNo   = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		long[] S = new long[suNo + 1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=suNo; i++){
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int q = 0; q<quizNo; q++){
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i - 1]);
		}
		
	}
}