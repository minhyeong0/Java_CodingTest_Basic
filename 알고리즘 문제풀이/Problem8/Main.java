package Problem.Problem8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solution(String text){
        String answer = "NO";
        text = text.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(text).reverse().toString();
        if(text.equals(tmp)) answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(solution(text));
    }
}
