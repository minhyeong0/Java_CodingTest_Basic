import java.util.*;




class Main_1 {
	
	static long func(long a, long b){
		return (a+b) * (a-b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(func(a,b));
	}
}