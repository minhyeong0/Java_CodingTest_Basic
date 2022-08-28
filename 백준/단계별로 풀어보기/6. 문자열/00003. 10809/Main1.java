import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


class Main1{
	//알바벳 소문자 97 ~ 122
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		char[] b = new char[a.length];
		
		//1. b를 넣는다
		//2. 인덱스를 증가한다
		//3. a와 b를 비교 같지 않으면 a를 저장하고 인덱스를 증가
		//4. e와 a,b를 비교하고 같지 않으면 e를 저장하고 인덱스 증가
		b[0] = a[0];
		for(int i=1; i<a.length; i++){
			boolean sw = true;
			for(int j=0; j<i; j++){
				if(b[j] == a[i]){
					sw = false;
				}
			}
			if(sw) b[i] = a[i];
		}
		
	
		for(int i=97; i<=122; i++){
			boolean sw = true;
			for(int j=0; j<b.length; j++){
				if(i == b[j]){
					System.out.print(j + " ");
					sw = false;
				}
			}
			if(sw) System.out.print(-1 + " ");
		}
	}
}