package Problem.Problem1;

import java.util.*;

public class Main {
    public static int solution(String text, char findText){
        int answer = 0;
        text = text.toUpperCase();
        findText = Character.toUpperCase(findText);

        //for(int i=0; i<text.length(); i++){
        //    if(text.charAt(i) == findText) answer++;
        //}

        for(char x : text.toCharArray()){
            if(x == findText) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("문자열을 입력하세요: ");
        String text = scan.next();

        //System.out.print("찾을 문자를 입력하세요: ");
        char findText = scan.next().charAt(0);

        System.out.println(solution(text, findText));
    }
}
