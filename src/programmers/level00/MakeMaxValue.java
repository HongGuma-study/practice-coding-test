package programmers.level00;

import java.util.Arrays;

public class MakeMaxValue {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5});
        solution(new int[]{0,31,24,10,1,9});
    }

    public static int solution(int[] numbers){
        int answer = 0;

        Arrays.sort(numbers);

        int n = numbers[numbers.length - 1];
        int m = numbers[numbers.length - 2];

        answer = n * m;

        System.err.println(answer);

        return answer;
    }
    
}
