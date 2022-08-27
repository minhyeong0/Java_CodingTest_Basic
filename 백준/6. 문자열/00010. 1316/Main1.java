import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Main1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<N; i++){
			char[] a = br.readLine().toCharArray();
			boolean[] arr = new boolean[26];
			boolean sw = false;
			for(int j=0; j<a.length; j++){
				arr[a[j] - 97] = true;
			}
			
			for(int j=0; j<arr.length; j++){
				if(arr[j] == true){
					int chk = 0;
					if(a[0] == (j + 97)) chk++;
					for(int k=1; k<a.length; k++){
						if(a[k-1] != (j + 97) && a[k] == (j + 97)){
							chk++;
						}
					}
					if(chk > 1){
						sw = false;
						break;
					}else{
						sw = true;
					}
				}
			}
			if(sw) count++;
		}
		
		System.out.println(count);
	}
}