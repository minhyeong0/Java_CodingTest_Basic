import java.util.*;





class Main_1 {
	
	public int Solution(int n, int m, int[][] board, int[] moves){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(board[j][moves[i]] != 0){
					if(stack.isEmpty())
						stack.push(board[j][moves[i]]);
					else {
						if(stack.peek() != board[j][moves[i]])
							stack.push(board[j][moves[i]]);
						else {
							stack.pop();
							answer+=2;
						}
					}
					board[j][moves[i]] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n+1][n+1];
		for(int i=1; i<=n; i++)
			for(int j=1; j<=n; j++)
				board[i][j] = sc.nextInt();
		int m = sc.nextInt();
		int[] moves = new int[m+1];
		for(int i=1; i<=m; i++)
			moves[i] = sc.nextInt();
		System.out.println(T.Solution(n, m, board, moves));
	}
}