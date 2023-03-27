import java.util.*;

class Point implements Comparable<Point> {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o){
		if(this.x == o.x)
			return this.y - o.y;
		else
			return this.x - o.x;
	}	
}

class Main_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(int i=0; i<n; i++)
			System.out.println(arr.get(i).x + " " + arr.get(i).y);
	}
}