import java.util.*;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	
	Time(int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Time ob){
		if(this.time == ob.time) return this.state - ob.state;
		else return this.time - ob.time;
	}
}

class Main1 {
	public int solution(ArrayList<Time> arr){
		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(arr);
		
		for(Time ob : arr){
			if(ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args){
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int sT = sc.nextInt();
			int eT = sc.nextInt();
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}