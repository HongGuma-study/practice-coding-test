package programmers.level02;

import java.util.ArrayList;
import java.util.Collections;

//가장 큰 수
public class TheLargestNumber {
    public static void main(String[] args) {
        solution(new int[]{6,10,2});
        solution(new int[]{3,30,34,5,9});
        solution(new int[]{123,1232});
        solution(new int[]{0,0});
        solution(new int[]{978, 97});
    }

    public static String solution(int[] numbers){
        StringBuilder answer = new StringBuilder();

        ArrayList<String> strNumbers = new ArrayList<>();

        for(int num : numbers){
            strNumbers.add(String.valueOf(num));
        }

        strNumbers.sort((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        System.out.println(strNumbers);

        if(strNumbers.get(0).equals("0")) return "0";

        for(String s : strNumbers){
            answer.append(s);
        }

        System.out.println(answer);
        return answer.toString();
    }

}
