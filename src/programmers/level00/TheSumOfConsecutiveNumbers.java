package programmers.level00;

import java.util.Arrays;

//연속된 수의 합
public class TheSumOfConsecutiveNumbers {
    public static void main(String[] args) {
        solution(3, 12);
        solution(5, 15);
        solution(4, 14);
        solution(5, 5);
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = total / num;
        int idx = 0;

        if(num % 2 == 0) idx = num/2 - 1;
        else idx = num/2;
       
        answer[idx] = mid;

        for(int i = idx - 1 ; i >= 0 ; i--){
            answer[i] = answer[i+1] - 1;
        }

        for(int i = idx + 1 ; i < answer.length ; i++){
            answer[i] = answer[i-1] + 1;
        }

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
