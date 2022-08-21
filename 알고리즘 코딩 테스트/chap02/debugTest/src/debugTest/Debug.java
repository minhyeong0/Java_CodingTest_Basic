package debugTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Debug{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] b = new String[a];
		int[] c = new int[a];
		
		for(int i=0; i<a; i++){
			String d = br.readLine();
			b[i] = d;
		}
		
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<a; i++){
			char[] e = b[i].toCharArray();
			if(e[i] == 'O'){
				count++;
				sum += count;
			}else if(e[i] == 'X'){
				count = 0;
			}
			if(i == a){
				c[i] = sum;
				sum = 0;
				count = 0;
			} 
		}
		
		for(int i=0; i<a; i++)
			System.out.println(c[i]);
	}
}