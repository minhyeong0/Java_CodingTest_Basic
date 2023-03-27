import java.util.*;




class Main_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = -1, b = -1, c = -1;
		int[] arr = arr = new int[3];
		while(a != 0 && b != 0 && c != 0){
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			Arrays.sort(arr);
			
			a = arr[0];
			b = arr[1];
			c = arr[2];
			if(a == 0 && b == 0 && c == 0)
				break;
			else if(a * a + b * b == c * c)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}