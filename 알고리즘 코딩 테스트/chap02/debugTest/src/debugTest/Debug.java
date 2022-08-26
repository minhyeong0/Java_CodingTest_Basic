package debugTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Debug{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		int count = 0;
		
		for(int i=0; i<a.length; i++){

			if(a[i] == 'j' && i != 0){
				if(a[i-1] == 'l' || a[i-1] == 'n'){
					count++;
				}
			}
			
			else if(a[i] == '-'){
				if(a[i-1] == 'c' || a[i-1] == 'd'){
					count++;
				}
			}
			
			else if(a[i] == '='){
				if(a[i-1] == 'c' || a[i-1] == 's'){
					count++;
				}
				
				if(a[0] != 'z' &&a[i-2] == 'd' && a[i-1] == 'z'){
					count += 2;
				}else if(a[i-1] == 'z'){
					count++;
				}
			}
		}
		
		System.out.println(a.length - count);
		
	}
}