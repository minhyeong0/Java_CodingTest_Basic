import java.util.Scanner;


class P11720_숫자의합{
	
	//시간제한이 1초이므로 연산횟수는 1억번 (100,000,000)임
	//N의 범위가 1 <= N <= 100 이므로 
	//데이터의 크기는 100임
	
	public static void main(String[] args) {
		//int, long 범위
		//int  -20억(10자리) ~ 20억(10자리)
		//long -900경(19자리) ~ 900경(19자리)
		//이므로 int, long형에 담을 수 없음
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Nums = sc.next();
		char[] cNums = Nums.toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<cNums.length; i++)
			//char -'0'를 빼면 int형으로 변환됨
			sum += cNums[i] - '0';
		
		System.out.println(sum);
	}
}