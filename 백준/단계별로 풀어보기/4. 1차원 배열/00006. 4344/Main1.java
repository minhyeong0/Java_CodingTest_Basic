import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	
	//연산횟수 : 100,000,000
	//데이터크기 : 1000
	//사용한 시간복잡도 : n^2 (10000)
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int sum = 0;
			double avg = 0;
			double up = 0;
			int[] score = new int[b];
			for(int j=0; j<b; j++){
				int c = Integer.parseInt(st.nextToken());
				score[j] = c;
				sum += c;
			}
			avg = sum / b;
			
			for(int j=0; j<b; j++){
				if(score[j] > avg){
					up++;
				}
			}

			double upAvg = (up / b) * 100.0;
			upAvg = Math.round(upAvg * 1000) / 1000.0;
			System.out.printf("%.3f%%\n", upAvg);
		}
	}
}