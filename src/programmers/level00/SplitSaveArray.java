package programmers.level00;

import java.util.ArrayList;

//잘라서 배열에 저장하기
public class SplitSaveArray {
    public static void main(String[] args) {
        solution("abc1Addfggg4556b",6);
        solution("abcdef123",3);
    }

    public static ArrayList<String> solution(String my_str, int n){
        ArrayList<String> answers = new ArrayList<>();

        while(my_str.length() > n){
            answers.add(my_str.substring(0,n));
            my_str = my_str.substring(n);
        }
        answers.add(my_str);
        System.out.println(answers);

        return answers;
    }
}
