import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main2{
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		String a = br.readLine();
		
		a = a.replaceAll("c=" , ",")
			 .replaceAll("dz=", ",")
			 .replaceAll("d-" , ",")
			 .replaceAll("lj" , ",")
			 .replaceAll("nj" , ",")
			 .replaceAll("s=" , ",")
			 .replaceAll("z=" , ",");
		
		System.out.println(a.length());
	}
}