import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		//연산횟수 : 200,000,000
		//데이터 크기 : 1
		//사용한 시간복잡도 : n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());	
		int d = a; //a의 값을 d에 저장
		String newNum = ""; //1의자리와 imsi를 결합한 값을 저장하는 공간
		int count = 0; //사이클 길이
		
		while(true){
			int b = d / 10; //10의자리
			int c = d % 10; //1의자리
			
			// 10의 자리와 1의자리를 더한값이 두자리가 넘아갈때 다시 1의자리만 추출
			int imsi = (b + c) % 10; 
			newNum = String.valueOf(c) + String.valueOf(imsi);
			d = Integer.valueOf(newNum);
			count++;
			
			if(a == d) break;
		}
		
		System.out.println(count);
		
	}
}