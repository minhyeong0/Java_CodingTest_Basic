


public class 시간복잡도_판별원리2{
	
	public static void main(String[] args){
		int N = 1000;
		int cnt = 0;
		
		//for문의 시간복잡도는 n번 for문이 3개이므로 시간복잡도는 3n번 
		//하지만 코딩테스트에서는 일반적으로 상수를 무시하므로 시간복잡도는 n번
		
		for(int i=0; i<N; i++){
			System.out.println("연산 횟수:" + cnt++);
		}
		
		for(int i=0; i<N; i++){
			System.out.println("연산 횟수:" + cnt++);
		}
		
		for(int i=0; i<N; i++){
			System.out.println("연산 횟수:" + cnt++);
		}
	}
}