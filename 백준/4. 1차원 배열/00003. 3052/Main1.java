import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



class Main1{
	
	//연산 횟수 : 100,000,000
	//데이터 크기 : 10
	//사용한 시간복잡도 : n (10)
	
	public static void main(String[] args) throws IOException{
		//1. 크기가 10인 배열을 만든다.
		//2. 42로 나눈 나머지를 배열에 저장한다.
		//3. n과 n+1값이 같으면 카운터를 증가시킨다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10];
		
		for(int i=0; i<=9; i++){
			a[i] = (Integer.parseInt(br.readLine())) % 42;
		}
		
		Arrays.sort(a);
		
		//카운트의 초기값이 1인 이유
		//처음 인텍스는 이전 인덱스값과 비교를 안하기때문에 1을 증가시켜줘야함
		int count = 1;
		
		for(int i=0; i<=8; i++){
			if(a[i] != a[i+1]){
				count++;
			}
		}
		
		System.out.println(count);
	}
}