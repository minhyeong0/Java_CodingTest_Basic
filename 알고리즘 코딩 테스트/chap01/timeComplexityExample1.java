


public class timeComplexityExample1{
	
	public static void main(String[] args){
		
		//빅오메가 표기법의 시간복잡도는 1번 (최선)
		//빅세타 표기법의 시간복잡도는 2/n번 (보통)
		//빅오 표기법의 시간복잡도는 n번
		
		//0~99사이 값 랜덤 선택
		int findNumber = (int)(Math.random()* 100);
		System.out.println("랜덤값 선택:" + findNumber);
		
		for(int i=0; i<100; i++){
			if(i == findNumber){
				System.out.println("값을 찾았습니다"+ i);
				break;
			}else{
				System.out.println("찾는중");
			}
			
		}
	}
}