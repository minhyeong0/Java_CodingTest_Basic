

public class 시간복잡도_판별원리1{
	
	public static void main(String[] args){
		int N = 1000;
		int cnt = 0;
		
		//for문의 시간복잡도는 n임
		
		for(int i=0; i<N; i++){
			System.out.println("연산 횟수:" + cnt++);
		}
	}
}