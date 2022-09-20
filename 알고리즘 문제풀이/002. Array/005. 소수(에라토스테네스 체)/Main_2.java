import java.util.Scanner;


class Main_2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		boolean[] ch = new boolean[n+1];
		
		for(int i=2; i<=n; i++){
			if(ch[i] == false){
				cnt++;
				for(int j=i; j<=n; j=j+i){
					ch[j] = true;
				}
			}
		}
		System.out.println(cnt);
	}
}