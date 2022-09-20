import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main_1{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(st1.nextToken());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<n; i++){
			if(a[i] == b[i]){
				System.out.println("D");
			}else if(a[i] == 1 && b[i] == 2){
				System.out.println("B");
			}else if(a[i] == 1 && b[i] == 3){
				System.out.println("A");
			}else if(a[i] == 2 && b[i] == 1){
				System.out.println("A");
			}else if(a[i] == 2 && b[i] == 3){
				System.out.println("B");
			}else if(a[i] == 3 && b[i] == 1){
				System.out.println("B");
			}else if(a[i] == 3 && b[i] == 2){
				System.out.println("A");
			}
		}
	}
}