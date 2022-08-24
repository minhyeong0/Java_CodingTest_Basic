import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main1{
	//연산횟수 : 100,000,000
	//데이터크기 : 
	//사용한 시간복잡도 : n^2
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<a; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken()); //반복할 횟수
			String[] c = st.nextToken().split(""); //반복할 문자열
			
			for(int j=0; j<c.length; j++){
				for(int k=0; k<b; k++){
					sb.append(c[j]);
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}