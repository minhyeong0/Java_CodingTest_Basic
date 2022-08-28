import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


class Main1{
	
	//크로아티아 알파벳이 있으면 그 단어를 1개 봐야하므로
	//단어가 두글자일때는 2 - 1을 해주고
	//단어가 세글자일때는 3 - 1를 해줘서 단어를 1개로 만들어줌
	//그다음 전체단어에서 크로아티아 단어의 개수를 빼주면 전체 단어의 개수가 됨
	
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
				
				else if(i != 1 && a[i-1] == 'z' && a[i-2] == 'd'){
					count += 2;
				}
				
				else if(a[i-1] == 'z'){
					count++;
				}
			}
		}
		
		System.out.println(a.length - count);
		
	}
}