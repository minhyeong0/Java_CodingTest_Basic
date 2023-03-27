import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;





class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		
		for(int i=1; i<a.length; i++){
			if(a[i-1] == a[i]){
				count++;
			}else{
				count++;
				if(count > 1){
					sb.append(a[i-1] + String.valueOf(count));
				}else{
					sb.append(a[i-1]);
				}
				count = 0;
			}
		}
		count++;
		
		if(count > 1){
			sb.append(a[a.length - 1] + String.valueOf(count));	
		}else{
			sb.append(a[a.length - 1]);
		}
	
		System.out.println(sb);
		
	}
}