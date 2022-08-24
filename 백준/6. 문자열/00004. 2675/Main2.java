import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main2{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			String[] c = st.nextToken().split("");
			for(int j=0; j<c.length; j++){
				System.out.print(c[j].repeat(b));
			}
			System.out.println();
			
		}
		
	}
}