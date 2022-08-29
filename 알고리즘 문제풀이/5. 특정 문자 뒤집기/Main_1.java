import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] a = br.readLine().toCharArray();
		int lt = 0;
		int rt = a.length - 1;
		
		while(lt < rt){
			char tLt = Character.toUpperCase(a[lt]);
			char tRt = Character.toUpperCase(a[rt]);
			
			if(!Character.isUpperCase(tLt)){
				lt++;
			}
			
			if(!Character.isUpperCase(tRt)){
				rt--;
			}
			
			if(Character.isUpperCase(tLt) && Character.isUpperCase(tRt)){
				char tmp = a[lt];
				a[lt] = a[rt];
				a[rt] = tmp;
				lt++;
				rt--;
			}
			

		}
		
		System.out.println(String.valueOf(a));
		
	}
}