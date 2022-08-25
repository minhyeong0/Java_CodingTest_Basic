import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Main1{ 
	
	//연산횟수 : 200,000,000
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toUpperCase().toCharArray();
		Arrays.sort(a);
		List<Integer> list = new ArrayList<>();
		
		int count = 1;
		for(int i=1; i<a.length; i++){
			if(a[i-1] == a[i]){
				count++;
			}else{
				list.add(count);
				count = 1;
			}
		}
		list.add(count);
		
		int max = 0;
		int maxIdx = -1;
		int tmp = 0;
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) > max){
				tmp = 0;
				max = list.get(i);
				maxIdx = i;
			}else if(list.get(i) == max){
				tmp++;
			}
		}
		
		if(tmp > 0){
			System.out.println("?");
		}else{
			int maxIndex = 0;
			for(int i=0; i<maxIdx; i++){
				maxIndex += list.get(i);
			}
			System.out.println(a[maxIndex]);
		}
		
		
	}
}