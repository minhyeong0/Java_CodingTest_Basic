import java.util.Scanner;


class Main2{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		//시간을 분으로 변환한뒤 분과 분으로 변환한 시간과 조리시간을 전부 더한다.
		int totalMin = a * 60 + b + c;
		
		//전체시간을 시간으로 변환한뒤 24시간 형식으로 바꿈
		int hour   = (totalMin / 60) % 24; 
		//전체시간에서 시간으로 변환한뒤 남은값을 분으로 저장
		int minute = totalMin % 60;
		
		System.out.println(hour + " " + minute);
	}
}