import java.util.*;



class Main1 {
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int x : arr){
			int tmp = 0;
			while(x > 0){
				tmp = (tmp * 10) + (x % 10);
				x /= 10;
			}
			boolean flag = true;
			for(int i=2; i<tmp; i++){
				if(tmp % i == 0){
					flag = false;
					break;
				}
			}
			if(flag && tmp != 1) answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		for(int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}