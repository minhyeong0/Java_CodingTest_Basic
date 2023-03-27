import java.util.*;
import java.text.SimpleDateFormat;



class Main_1 {
	
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		System.out.println(format.format(now));
	}
}