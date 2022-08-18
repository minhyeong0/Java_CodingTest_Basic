import java.util.Scanner;



class Main1_1546{
	
	public static void main(String[] args){
		//시간제한은 2초이므로 연산횟수 성공 조건은 2억번이다
		//데이터의 크기는 1000이다
		
		//for문 하나를 사용했으므로 시간복잡도는 1000, 2억번보다 작으므로 적합한 알고리즘임
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double [] b = new double[a];
		double max = Integer.MIN_VALUE;
		double sum = 0;
		
		for(int i=0; i<a; i++){
			b[i] = sc.nextDouble();
			sum += b[i];
			if(b[i] > max) max = b[i];
		}
		
		double avg = ((sum / max) * 100) / a;
		System.out.println(avg);
	}
}