package Problem.Problem3;

import java.util.Scanner;

public class Main {
//public static String solution(String str){
//    String answer = "";
//    String[] splitStr = str.split(" ");
//
//    int maxLength = Integer.MIN_VALUE;
//    for(int i=0; i<splitStr.length; i++){
//        if(splitStr[i].length() > maxLength){
//            answer = splitStr[i];
//            maxLength = splitStr[i].length();
//        }
//    }
//    return  answer;
//}

//public static String solution1(String str){
//    String answer = "";
//
//    for(String s : str.split(" ")){
//        if(s.length() > answer.length()) answer = s;
//    }
//
//    return answer;
//}

    public static String solution3(String str){
        String answer = "";
        int maxLength = Integer.MIN_VALUE;
        int pos;

        //pos : str의 index가 공백을 발견하면 그값을 리턴함
        //index
        while ((pos = str.indexOf(" "))!= -1){
            //subString(from, to) : from부터 to전까지 잘라냄
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len > maxLength){
                maxLength = len;
                answer = tmp;
            }
            //공백다음부터 끝까지 문자추출
            str = str.substring(pos+1);
        }
        if(str.length()>maxLength){
            answer = str;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution3(str));
    }
}
