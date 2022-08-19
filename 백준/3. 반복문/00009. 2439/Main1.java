import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산횟수 : 100,000,000
		//데이터크기 : 100
		//사용한 시간복잡도 : n^2 (100^2 = 10000)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=a; j++){
				if(j >= a + 1 - i){
					sb.append("*");
				}else{
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}