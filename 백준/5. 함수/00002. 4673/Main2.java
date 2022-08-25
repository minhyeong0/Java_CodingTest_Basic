

class Main2{
	
	public static void main(String[] args){
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++){
			int selfNum = d(i);
			
			if(selfNum < 10001){
				//셀프넘퍼인 값을 true로 바꾼다.
				check[selfNum] = true;
			}
		}
		
		for(int i=0; i<10001; i++){
			if(check[i] == false){
				System.out.println(i);
			}
		}
	}
	
	//셀프넘버 구하는 함수
	static int d(int i){
		int result = i;
		while(i > 0){
			result += i % 10;
			i = i / 10;
		}
		
		return result;
	}
}