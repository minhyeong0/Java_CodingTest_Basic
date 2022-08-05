package Problem.Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = s.next();
        }

        for(String x : solution1(n,str)){
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution1(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return  answer;
    }

    private static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = s[tmp];
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);

        }
        return  answer;
    }
}
