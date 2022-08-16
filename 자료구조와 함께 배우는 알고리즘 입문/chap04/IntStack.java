public class IntStack{
	
	private int[] stk; //스택용 배열
	private int capacity; //스택 용량
	private int ptr; //스택 포인터
	
	
	//실행 시 예외: 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){}
	}
	
	//실행 시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}
	
	//생성자
	public IntStack(int maxlen){
		ptr = 0;
		capacity = maxlen;
		try{
			stk = new int[capacity]; //스택 본체용 배열 생성
		}catch(OutOfMemoryError e){
			capacity = 0;
		}
	}
	
	//푸시
	public int push(int x) throws OverflowIntStackException{
		//스택의 용량이 가득차면
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		
		//아니면 푸시
		return stk[ptr++] = x;
	}
	
	//팝
	public int pop() throws EmptyIntStackException{
		//스택이 비어있으면
		if(ptr <= 0)
			throw new EmptyIntStackException();
		//아니면 팝
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	//스택 비움
	public void clear(){
		ptr = 0;
	}
	
	//인덱스 찾기
	public int indexOf(int x){
		for(int i = ptr - 1; i >= 0; i--){
			//인덱스가 있으면
			if(stk[i] == x){
				return i;
			}
		}
		//없으면
		return -1;
	}
	
	//스택 용량을 반환
	public int getCapacity(){
		return capacity;
	}
	
	//스택에 쌓여 있는 데이터 개수 반환
	public int size(){
		return ptr;
	}
	
	//스택이 비어있는지 확인
	public boolean isEmpty(){
		return ptr <= 0;
	}
	
	//스택이 가득찼는지 확인
	public boolean isFull(){
		return ptr >= capacity;
	}
	
	//스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump(){
		if(ptr <= 0){
			System.out.println("스택이 비어있습니다.");
		}else{
			for(int i=0; i<ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	
}