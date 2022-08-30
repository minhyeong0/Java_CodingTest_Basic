package debugTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;





class Debug {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		char tmp = a[0];
		int count = 1;
		
		for(int i=1; i<=a.length; i++){
			if(a[i-1] != a[i]){
				if(count > 1){
					sb.append(a[i-1] + String.valueOf(count));	
				}else{
					sb.append(a[i-1]);	
				}
				count = 0;
				tmp = a[i];
			}
			count++;
		}
		
		System.out.println(sb);
		
	}
}