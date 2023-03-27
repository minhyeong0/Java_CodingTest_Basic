import java.util.*;



class Main1 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < k; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		answer.add(map.size());
		
		for (int i = k; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			map.put(arr[i-k], map.get(arr[i-k]) - 1);
			if(map.get(arr[i-k]) == 0) map.remove(arr[i-k]);
			answer.add(map.size());
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int x : T.solution(n, k, arr))
			System.out.print(x + " ");
	}
}