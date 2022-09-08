import java.util.*;




class Main_2 {
	
	public ArrayList<Integer> Solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int pA = 0, pB = 0;
		
		while(pA<n && pB<m){
			if(a[pA] < b[pB])
				answer.add(a[pA++]);
			else
				answer.add(b[pB++]);
		}
		
		while(pA<n)
			answer.add(a[pA++]);
		
		while(pB<m)
			answer.add(b[pB++]);
		
		return answer;
	}
	
	
	public static void main(String[] args){
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++)
			b[i] = sc.nextInt();
		for(int x : T.Solution(n, m, a, b))
			System.out.print(x + " ");
	}
}