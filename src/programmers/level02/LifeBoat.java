package programmers.level02;

import java.util.*;

//구명보트 문제
public class LifeBoat {
    public static void main(String[] args) {
        solution(new int[]{70, 50, 80, 50}, 100);
        solution(new int[]{70, 80, 50}, 100);
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        ArrayList<Integer> peopleArr = new ArrayList<>();
        for(int p : people) peopleArr.add(p);
        Collections.sort(peopleArr,Collections.reverseOrder());
        System.out.println(peopleArr);
        int idx = people.length - 1;
        for(int i = 0; i < peopleArr.size(); i++){
            if(i > idx) break;

            if(peopleArr.get(i) + peopleArr.get(idx) <= limit)
                idx--;

            answer++;
        }

        System.out.println(answer);
        return answer;
    }
}
