package debugTest;

import java.util.Scanner;




class Debug{
	//제곱근 소수판별
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=2; i<=n; i++){
			boolean sw = false;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i % j != 0) {
					sw = true;
					break;
				}
			}
			if(sw) count++;
			
		}
		
		System.out.println(count);
	}
}

