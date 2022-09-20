import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



class Main_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] a = br.readLine().toCharArray();
		char[] b = new char[a.length];
		
		for(int i=0; i<a.length; i++){
			boolean sw = true;
			for(int j=0; j<=i; j++){
				if(a[i] == b[j]){
					sw = false;
				}
			}
			if(sw) b[i] = a[i];
		}
		
		System.out.println(String.valueOf(b).replaceAll("\0", ""));
		
	}
}