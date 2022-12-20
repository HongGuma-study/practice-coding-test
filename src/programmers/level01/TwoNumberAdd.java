package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;

//두개 뽑아서 더하기
public class TwoNumberAdd {
    public static void main(String[] args) {
        solution(new int[]{2,1,3,4,1});
        solution(new int[]{5,0,2,7});

    }

    static ArrayList<Integer> solution(int[] numbers){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(!result.contains(sum))
                    result.add(sum);
            }
        }

        Collections.sort(result);

        return result;
    }
}
