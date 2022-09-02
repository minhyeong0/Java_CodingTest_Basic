import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb1;
		StringBuilder sb2 = new StringBuilder();
		while(st.hasMoreTokens()){
			sb1 = new StringBuilder(st.nextToken());
			int a = Integer.parseInt(sb1.reverse().toString());
			boolean sw = true;
			if(a == 1){
				sw = false;
			}else{
				for(int i=2; i<=Math.sqrt(a); i++){
					if(a % i == 0){
						sw = false;
						break;
					}
				}
			}
			if(sw) sb2.append(a + " ");
		}
		System.out.println(sb2);
	}
}