package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

//과일 장수
public class AFruitSeller {
    public static void main(String[] args) {
        solution(3,4,new int[]{1,2,3,1,2,3,1});
        solution(4,3,new int[]{4,1,2,2,4,4,4,4,1,2,4,2});
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        ArrayList<Integer> scores = new ArrayList<>();
        for(int s : score){
            scores.add(s);
        }

        Collections.sort(scores,Collections.reverseOrder());

        for(int i=0; i<scores.size(); i++){
            if(i > 0 && i % m == (m-1))
                answer += (scores.get(i) * m * 1);
        }

        return answer;
    }
}
