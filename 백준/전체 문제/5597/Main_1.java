import java.util.*;



class Main_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[29];
		for(int i=1; i<=28; i++)
			arr[i] = sc.nextInt();
		boolean[] chk = new boolean[31];
		for(int x : arr) chk[x] = true;
		
		for(int i=1; i<chk.length; i++){
			if(chk[i] == false){
				System.out.println(i);
			} 
		}
	}
}