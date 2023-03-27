import java.util.*;



class Main_1 {
	
	public int solution(int x, int y, int w, int h){
		int answer = Integer.MAX_VALUE;
		int[] tmp = new int[4];
		
		tmp[0] = h - y;
		tmp[1] = y;
		tmp[2] = x;
		tmp[3] = w - x;
		
		for(int i=0; i<tmp.length; i++){
			if(tmp[i] < answer){
				answer = tmp[i];
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		System.out.println(T.solution(x, y, w, h));
	}
}