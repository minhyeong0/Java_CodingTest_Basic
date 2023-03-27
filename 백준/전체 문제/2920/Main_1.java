import java.util.*;




class Main_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		String res = "mixed";
		
		for(int i=0; i<8; i++)
			arr[i] = sc.nextInt();
		
		for(int i=0; i<8; i++){
			if(arr[i] != i+1){
				res = "mixed";
				break;
			} else
				res = "ascending";
		}
		
		if(res != "ascending"){
			for(int i=0; i<8; i++){
				if(arr[i] != 8-i){
					res = "mixed";
					break;
				} else
					res = "descending";
			}
		}
		
		System.out.println(res);	
	}
}