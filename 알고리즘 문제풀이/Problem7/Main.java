package Problem.Problem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        System.out.println(solution(text));
    }

    public static String solution(String text){
        String answer = "YES";
        text = text.toUpperCase();
        char[] arr = text.toCharArray();
        int lt = 0;
        int rt = arr.length -1;
        int chk = 0;
        while (lt<rt){
            if(!(arr[lt] == arr[rt])){
                answer = "NO";
                return answer;
            }
            lt++;
            rt--;
        }
        return answer;
    }
}
