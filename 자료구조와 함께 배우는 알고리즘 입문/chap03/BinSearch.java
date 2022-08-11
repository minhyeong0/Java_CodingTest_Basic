import java.util.Scanner;


class BinSearch{
	
	static int binSearch(int a[], int n, int key){
		int pl = 0; //앞 포인터
		int pr = n - 1; // 뒤 포인터
		
		do{
			int pc = (pl + pr) / 2; //중앙 포인터
			if(a[pc] == key){
				return pc; //검색 성공
			}else if(a[pc] < key){
				pl = pc + 1; //검색범위를 뒤쪽 절반으로 줄임
			}else{
				pr = pc - 1; //검색범위를 앞쪽 절반으로 줄임
			}
		}while(pl <= pr);
		
		return -1; //검색실패
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i=1; i<num; i++){
			do{
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			}while(x[i] < x[i -1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1){
			System.out.println("그 값의 요소가 없습니다.");
		}else{
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}