import java.util.Scanner;



class Main2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//알파벳 인덱스를 저장하는 배열
		int[] arr = new int[26];
		
		
		for(int i=0; i<s.length(); i++){
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
				arr[s.charAt(i) - 'A']++; //찾은 알파벳의 인덱스의 값을 1증가
			}else{
				arr[s.charAt(i) - 'a']++; //찾은 알파벳의 인덱스의 값을 1증가
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++){
			if(arr[i] > max){
				max = arr[i];
				ch  = (char) (i + 65); //알파벳의 인덱스를 char형으로 변환
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}
}