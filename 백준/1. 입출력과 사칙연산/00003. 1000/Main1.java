import java.util.Scanner;


class Main1 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String input = stdIn.nextLine();
		
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		
		System.out.println(a + b);
	}
}