import java.util.*;
import java.io.*;



class Main_1 {
	
	public int Solution(String S, String T){
		int answer = 0, lt = 0;
		HashMap<Character, Integer> SM = new HashMap<>();
		HashMap<Character, Integer> TM = new HashMap<>();
		
		for(char x : T.toCharArray())
			TM.put(x, TM.getOrDefault(x, 0) + 1);
		
		for(int i=0; i<T.length()-1; i++)
			SM.put(S.charAt(i), SM.getOrDefault(S.charAt(i),0) + 1);
		
		for(int rt=T.length()-1; rt<S.length(); rt++){
			SM.put(S.charAt(rt), SM.getOrDefault(S.charAt(rt), 0) + 1);
			if(SM.equals(TM)) answer++;
			SM.put(S.charAt(lt), SM.get(S.charAt(lt)) - 1);
			if(SM.get(S.charAt(lt)) == 0)
				SM.remove(S.charAt(lt));
			lt++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		Main_1 T = new Main_1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		System.out.println(T.Solution(a, b));
	}
}