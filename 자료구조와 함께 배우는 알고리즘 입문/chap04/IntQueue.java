

public class IntQueue{
	
	private int[] que;    // 큐용 배열
	private int capacity; // 큐의 용량
	private int front;    // 맨 앞의 요소 커서
	private int rear;     // 맨 뒤의 요소 커서
	private int num;      // 현재 데이터 개수
	
	
	//실행시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException(){};
	}
	
	//실행시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException(){};
	}
	
	//생성자
	public IntQueue(int maxlen){
		num = front = rear = 0;
		capacity = maxlen;
		try{
			que = new int[capacity];
		}catch(OutOfMemoryError e){
			capacity = 0;
		}
	}
	
	//인큐
	public int enque(int x) throws OverflowIntQueueException{
		//데이터의 개수가 용량보다 많으면
		if(num >= capacity){
			throw new OverflowIntQueueException();
		}
		
		//아니면 인큐
		que[rear++] = x;
		num++;
		
		//배열용량이 가득찼을때 배열의 첫부분에 인큐하기
		if(rear == capacity){
			rear = 0;
		}
		
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		//데이터가 없으면
		if(num <= 0){
			throw new EmptyIntQueueException();
		}
		//있으면
		int x = que[front++];
		num--;
		
		//배열용량이 가득찼을때 배열의 첫부분에 디큐하기
		if(front == capacity){
			front = 0;
		}
		
		return x;
	}
	
	//큐에서 데이터를 피큐(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//큐를 비움
	public void clear(){
		num = front = rear = 0;
	}
	
	//큐에서 x를 검색한 인덱스 반환 (찾지 못하면 -1)
	public int indexOf(int x){
		for(int i=0; i<num; i++){
			//용량보다 작으면 나머지는 front + i가 됨
			int idx = (i + front) % capacity;
			if(que[idx] == x)
				return idx;
		}
		
		return -1;
	}
	
	//큐의 용량을 반환
	public int getCapacity(){
		return capacity;
	}
	
	//큐에 쌓여있는 데이터 개수 반환
	public int size(){
		return num;
	}
	
	//큐가 비어있는지 확인
	public boolean isEmpty(){
		return num <= 0;
	}
	
	//큐가 가득찼는지 확인
	public boolean isFull(){
		return num >= capacity;
	}
	
	//큐 안의 모든데이터를 프러트 -> 리어 순서로 출력
	public void dump(){
		if(num <= 0){
			System.out.println("큐가 비어 있습니다.");
		}else{
			for(int i=0; i<num; i++){
				//용량보다 작으면 나머지는 front + i가 됨
				System.out.print(que[(i+ front) % capacity] + " ");
			}
			System.out.println();
		}
	}
	
}