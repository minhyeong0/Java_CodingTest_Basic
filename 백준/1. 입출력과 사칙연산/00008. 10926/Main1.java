import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//StringBuffer, StringBuilder는 java.lang 클래스이므로 따로 임포트 X

class Main1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuffer sb = new StringBuffer(input);
		sb.append("??!");
		System.out.println(sb.toString());
	}

}