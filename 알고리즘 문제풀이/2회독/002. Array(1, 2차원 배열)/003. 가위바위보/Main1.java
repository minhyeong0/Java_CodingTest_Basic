import java.util.*;




class Main1 {
	
	public char[] solution(int n, int[] a, int[] b){
		char[] answer = new char[n];
		for(int i=0; i<n; i++){
			if(a[i] == 1){
				switch(b[i]){
					case 1:
						answer[i] = 'D';
						break;
					case 2:
						answer[i] = 'B';
						break;
					case 3:
						answer[i] = 'A';
						break;
				}
			} else if(a[i] == 2){
				switch(b[i]){
					case 1:
						answer[i] = 'A';
						break;
					case 2:
						answer[i] = 'D';
						break;
					case 3:
						answer[i] = 'B';
						break;
				}
			} else{
				switch(b[i]){
					case 1:
						answer[i] = 'B';
						break;
					case 2:
						answer[i] = 'A';
						break;
					case 3:
						answer[i] = 'D';
						break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		for(int i=0; i<n; i++)
			b[i] = sc.nextInt();
		for(char x : T.solution(n, a, b))
			System.out.println(x);
	}
}