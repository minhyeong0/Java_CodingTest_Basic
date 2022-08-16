import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main1{
	
	public static void main(String[] args) throws IOException{
		
		//1. 1번값 2번값을 줄바꿈하여 입력받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int[] cutNum2 = new int[(int)(Math.log10(num2)+1)];
		
		
		//2. num2를 끝자리 부터 하나씩 분해서 배열에 저장한다.
		for(int i=0; i <cutNum2.length; i++){
			cutNum2[i] = num2 % 10;
			num2 = num2 / 10;
		}
		
		//3. 끝자리 부터 분해한 num2에 num1을 곱해 출력한다.
		for(int i=0; i<cutNum2.length; i++){
			cutNum2[i] = cutNum2[i] * num1;
			bw.write(String.valueOf(cutNum2[i]));
			bw.newLine();
		}

		
		//4. 3번째자리와 2번째 자리에 00을 붙인다.
		int multiple = 0;
		for(int i=0; i<cutNum2.length; i++){
			multiple += cutNum2[i] * (int)(Math.pow(10, i));
		}
			
		
		//5. 출력한다
		bw.write(String.valueOf(multiple));
		bw.newLine();
		
		br.close();
		bw.close();
	}
}