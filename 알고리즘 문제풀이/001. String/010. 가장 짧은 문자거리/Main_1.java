import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;




class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		char b = st.nextToken().charAt(0);
		int[] c = new int[a.length()];
		
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i) != b){
				String preA = a.substring(0, i);
				String sufA = a.substring(i+1);
				int pre = 0;
				int suf = 0;
				
				if(preA.lastIndexOf(b) != -1 && preA.length() != 0){
					pre = preA.length() - preA.lastIndexOf(b);
				}else {
					pre = 1000;
				}
				if(sufA.indexOf(b) != -1 && sufA.length() != 0){
					suf = sufA.indexOf(b) + 1;
				}else {
					suf = 1000;
				}
				
				if(pre == 1000 && suf == 1000) continue;

		
				if(pre < suf){
					c[i] = pre;
				}else{
					c[i] = suf;
				}
			}
		}
		
		for(int i=0; i<c.length; i++)
			System.out.print(c[i] + " ");
	}
}