package Problem.Problem6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        char[] arr = input.toCharArray();
        List<Character> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[i]);
            }else{
                if(!(list.contains(arr[i]))){
                    list.add(arr[i]);
                }
            }
        }
        String answer = "";
        for(char a :list){
            answer += a;
        }
        System.out.println(answer);
    }
}
