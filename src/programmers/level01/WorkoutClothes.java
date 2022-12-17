package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

//체육복
public class WorkoutClothes {
    public static void main(String[] args) {
        solution(5,new int[]{2,4}, new int[]{1,3,5});
        solution(5,new int[]{2,4}, new int[]{3});
        solution(3,new int[]{3}, new int[]{1});
        solution(13,new int[]{1, 2, 5, 6, 10, 12, 13}, new int[]{2, 3, 4, 5, 7, 8, 9, 10, 11, 12});

    }

    public static int solution(int n, int[] lost, int[] reserve){
        int result = 0;

        int[] lostList = new int[n];
        int[] reserveList = new int[n];

        for(int i=0; i<n; i++){
            for (int value : lost) {
                lostList[value - 1] = 1;
            }
            for (int j : reserve) {
                reserveList[j - 1] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if(lostList[i] == 1 && reserveList[i] == 1){
                lostList[i] = 0;
                reserveList[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            if(lostList[i] == 1){
                if(i > 0){
                    if(reserveList[i-1] == 1){
                        reserveList[i-1] = 0;
                        result++;
                        continue;
                    }
                }
                if(i != n-1){
                    if(reserveList[i+1] == 1){
                        reserveList[i+1] = 0;
                        result++;
                    }
                }
            }else{
                result++;
            }
        }

        System.out.println(result);
        return result;
    }
}
