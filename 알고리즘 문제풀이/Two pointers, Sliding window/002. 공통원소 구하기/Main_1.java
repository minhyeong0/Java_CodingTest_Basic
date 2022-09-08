import java.util.*;





class Main_1 {
	
	public ArrayList<Integer> Solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int pA = 0, pB = 0;
		
		while(pA < n && pB < m){
			if(a[pA] < b[pB]) pA++;
			else if(a[pA] == b[pB]){
				answer.add(a[pA]);
				pA++;
				pB++;
			}else pB++;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
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