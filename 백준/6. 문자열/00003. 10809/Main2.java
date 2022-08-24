import java.util.Scanner;



class Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=97; i<=122; i++){
			sb.append(a.indexOf((char)i)).append(" ");
		}
		
		System.out.println(sb);
	}
}