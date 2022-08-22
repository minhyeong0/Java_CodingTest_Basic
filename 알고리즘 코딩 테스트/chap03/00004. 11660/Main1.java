import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


class Main1{
	
	//연산 횟수 : 100,000,000
	//데이터크기 : 100,000
	//사용한 시간복잡도 : n^2
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] c = new int[a][a + 1];
		
		for(int i=0; i<a; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j<=a; j++){
				c[i][j] = c[i][j - 1] + Integer.parseInt(st.nextToken());
				if(i < a - 1){
					if(j == a){
						c[i+1][0] = c[i][j];
					}
				}
			}
		}
		
		//System.out.println(Arrays.deepToString(c));
		
		
		
		for(int i=0; i<b; i++){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()) - 1;
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()) - 1;
			int y2 = Integer.parseInt(st.nextToken());
			System.out.println(c[x2][y2] - c[x1][y1 - 1]);
		}

	}
}