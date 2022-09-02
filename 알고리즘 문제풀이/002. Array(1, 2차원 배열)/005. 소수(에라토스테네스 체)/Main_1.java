import java.util.Scanner;


//제곱근
class Main_1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		
		for(int i=3; i<=n; i=i+2){
			boolean sw = true;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i % j == 0){
					sw = false;
					break;
				}
			}
			if(sw) cnt++;
		}
		System.out.println(cnt);
	}
}