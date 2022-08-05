import java.util.Scanner;

class Solution1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		
		System.out.println(a + b);
	}
}