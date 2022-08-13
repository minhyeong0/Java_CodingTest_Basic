import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//BufferedWriter로도 화면 출력할 수 있음


class Main1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		System.out.println(input - 543);
	}
}