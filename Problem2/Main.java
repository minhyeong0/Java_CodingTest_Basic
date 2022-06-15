package Problem.Problem2;

import java.util.Scanner;

public class Main {
    //아스키코드
    //대문자 : 65 ~ 90
    //소문자 : 97 ~ 122
    //소문자에서 32를 빼면 대문자가 됨
    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if( 97 <= x && x <= 122){
               answer += (char)(x - 32);
            }else {
                answer += (char)(x + 32);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
