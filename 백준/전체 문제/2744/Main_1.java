import java.util.*;




class Main_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = "";
		for(char x : str.toCharArray()){
			if(Character.isUpperCase(x))
				res += Character.toLowerCase(x);
			else
				res += Character.toUpperCase(x);
		}
		System.out.println(res);
	}
}