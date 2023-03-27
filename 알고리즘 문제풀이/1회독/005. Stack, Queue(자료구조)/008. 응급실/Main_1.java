import java.util.*;




class Main_1 {
	
	class Person {
		int number;
		int value;
		
		Person(int number, int value){
			this.number = number;
			this.value = value;
		}
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		
		for(int i=0; i<n; i++)
			Q.offer(new Person(i, arr[i]));
		
		while(!Q.isEmpty()){
			Person tmp = Q.poll();
			for(Person x : Q){
				if(x.value > tmp.value){
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null){
				answer++;
				if(tmp.number == m)
					return answer;
			}
		}
		
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}