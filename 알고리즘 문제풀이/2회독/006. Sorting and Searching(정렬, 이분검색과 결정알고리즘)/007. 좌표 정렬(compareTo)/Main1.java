import java.util.*;


class Point implements Comparable<Point> {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point p) {
		if (this.x == p.x)
			return this.y - p.y;
		else
			return this.x - p.x;
	}
}

class Main1 {
	public ArrayList<Point> solution(int n, ArrayList<Point> arr) {
		Collections.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++)
			arr.add(new Point(sc.nextInt(), sc.nextInt()));
		for (Point p : T.solution(n, arr))
			System.out.println(p.x + " " + p.y);
	}
}