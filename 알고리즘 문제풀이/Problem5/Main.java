package Problem.Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = s.toCharArray();
        int lt = 0;
        int rt = arr.length -1;

        while (lt<rt){
            if(!('a'<=arr[lt] && arr[lt]<='z' || 'A'<=arr[lt] && arr[lt]<='Z')){
                lt++;
            } else if (!('a'<=arr[rt] && arr[rt]<='z' || 'A'<=arr[rt] && arr[rt]<='Z')) {
                rt--;
            }else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(arr));

    }
}