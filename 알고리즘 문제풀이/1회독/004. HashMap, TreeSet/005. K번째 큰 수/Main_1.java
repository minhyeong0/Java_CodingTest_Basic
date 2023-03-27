import java.util.*;



class Main_1 {
	
	public int Solution(int n, int k, int[] arr){
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n-2; i++)
			for(int j=i+1; j<n-1; j++)
				for(int l=j+1; l<n; l++)
					set.add(arr[i]+arr[j]+arr[l]);
		
		int count = 0;
		for(int x : set){
			count++;
			if(count == k) return x;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args){
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(T.Solution(n, k, arr));
	}
}