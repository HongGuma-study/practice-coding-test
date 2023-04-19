package programmers.level01;

import java.util.Arrays;

// 가장 가까운 같은 글자
public class TheNearestSameWordClosestTo {
    public static void main(String[] args) {
        solution("banana");
        solution("foobar");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1; //첫번째 단어는 무조건 -1
        for(int i = s.length()-1; i>0; i--){
            char ch = s.charAt(i);
            s = s.substring(0,i);
            if(s.lastIndexOf(ch) == -1) answer[i] = -1;
            else answer[i] = i - s.lastIndexOf(ch);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
