



public class 시간복잡도_판별원리3{
	
	public static void main(String[] args){
		int N = 1000;
		int cnt = 0;
		
		//중첩for문의 시간복잡도는 n^2임
		//만약 일반for문이 10개가 더 있더라도 
		//시간복잡도가 가장 큰 것을 기준으로 시간복잡도가 유지됨 
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.println("연산횟수:" + cnt++);
			}
		}
	}
}