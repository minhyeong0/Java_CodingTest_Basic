import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main_1{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] a = br.readLine().toUpperCase().toCharArray();
		
		int lt = 0;
		int rt = a.length - 1;
		String res = "YES";
		
		while(lt < rt){
			if(a[lt] == a[rt]){
				lt++;
				rt--;
			}else{
				res = "NO";
				break;
			}
		}
		
		System.out.println(res);
		
	}
}