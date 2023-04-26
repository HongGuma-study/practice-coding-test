package programmers.level02;

import java.util.Arrays;

// JadenCase 문자열 만들기
public class MakeAJadenCaseString {
    public static void main(String[] args) {
        solution("3people unFollowed me");
        solution("for the last week");
        solution(" for the last week  ");
        solution("  for the last  week");
    }

    public static String solution(String s){
        String answer = "";

        String[] strArr = s.toLowerCase().split(" ");

        for(String word : strArr){
            if(word.equals("")){
                answer += " ";
                continue;
            }
            char first = word.charAt(0);
            if(first >= 97 && first <= 122){
                first -= 32;
                word = first + word.substring(1);
            }
            answer += word + " ";
        }

        if(s.charAt(s.length()-1) != 32)
            answer = answer.substring(0,answer.length()-1);

        return answer;
    }
}
