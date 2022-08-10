import java.util.Scanner;

class CardConv{
	
		public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int no;    //10진수값 저장
		int cd;    //변환할려는 진수값 선택
		int dno;   //변환 후의 자릿수              
		int retry;
		char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어 두는 문자배열
		
		System.out.println("10진수를 기수로 변환합니다.");
		do{
			do{
				System.out.print("변환하는 음이 아닌 정수: ");
				//10진수 입력받음
				no = stdIn.nextInt();
			}while(no < 0);
			
			do{
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				//변환받을려는 진수선택
				cd = stdIn.nextInt();
			}while(cd < 2 || cd > 36);
			
			
			dno = cardConv(no, cd, cno); //no를 cd진수로 변환
			
			System.out.print(cd + "진수로");
			for(int i=0; i< dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}
	
	//정수x를 r진수로 변환한 숫자문자를 char배열에 저장
	static int cardConv(int x, int r, char[] d){
		
		//자릿수변수
		int digits = 0;
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do{
			//x(10진수)를 r(변환할 진수)로 나눈 나머지를 d배열에 자장한뒤 자리수 증가
			d[digits++] = dchar.charAt(x % r);
			
			//x = x/r;
			x /= r;
		}while(x != 0);
		
		for(int i=0; i< digits / 2; i++){
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
}