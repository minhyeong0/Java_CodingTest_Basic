import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] b = new int[a];
		int count = 1;
		
		for(int i=0; i<a; i++){
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = b[0];
		
		for(int i=1; i<a; i++){
			if(b[i] > b[i-1]){
				if(b[i] > max){
					max = b[i];
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
		
	}
}