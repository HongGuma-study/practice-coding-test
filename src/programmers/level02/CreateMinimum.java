package programmers.level02;

import java.util.Arrays;
import java.util.Collections;

//최솟값 만들기
public class CreateMinimum {
    public static void main(String[] args) {
        solution(new int[]{1,4,2}, new int[]{5,4,4});
        solution(new int[]{1,2}, new int[]{3,4});
    }

    public static int solution(int[] A, int[] B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            answer += (A[i] * B[B.length-1-i]);
        }

        System.out.println(answer);
        return answer;
    }
}
