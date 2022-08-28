import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;


class Main3{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//배열의 인덱스의 값은 알파벳 값을 의미함
		int[] a = new int[26];
		Arrays.fill(a, -1);
		
		char[] str = br.readLine().toCharArray();
		
		for(int i=0; i<str.length; i++){
			//입력한 문자 - 97의 a배열 인덱스가 -1이면 
			//문자가 처음 나온 것이므로 해당인덱스에 문자열의 인덱스를 삽입
			//만약 똑같은 문자가 들어가면 a배열의 인덱스는 -1이 아니므로 들어가지 않음
			if(a[(byte)str[i] - 97] == -1)
				a[(byte)str[i] - 97] = i;
		}
		
		for(int i=0; i<a.length; i++){
			bw.write(a[i] + " ");
		}
		
		bw.close();
		
		
	}
}