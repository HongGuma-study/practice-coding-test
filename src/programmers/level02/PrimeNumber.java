package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumber {

    public static void main(String[] args) {
        solution("17");
        solution("011");
        solution("1231");
    }

    static String[] nums = {};
    static boolean[] visit;
    static String[] output = {};
    static Set<Integer> permNums;


    public static int solution(String numbers) {
        int answer = 0;

        nums = new String[numbers.length()];
        permNums = new LinkedHashSet<>();
        visit = new boolean[nums.length];
        output = new String[nums.length];

        for(int i=0; i<numbers.length(); i++){
            nums[i] = String.valueOf(numbers.charAt(i));
        }

        //숫자 조합하기
        for(int i=1; i<= nums.length; i++){
            perm(nums, visit,output,0, nums.length, i);
        }

        System.out.println(permNums);


        //조합한 숫자 소수 판별하기
        for(int num : permNums){
            if(num == 1 || num == 0) continue;
            int divisorCnt = 0;
            for(int i=1; i<=Math.sqrt(num); i++){
                //약수 찾기
                if(num % i == 0){
                    divisorCnt++;
                    if(i != num/i) divisorCnt++;
                }
            }
            //약수가 1과 자기 사진이면 소수
            if(divisorCnt == 2) answer++;
        }

        System.out.println(answer);
        return answer;
    }


    public static void perm(String[] arr, boolean[] visit, String[] output, int depth, int n, int k){
        if(depth == k){
            String num = "";
            for(int i=0; i<n; i++){
                if(output[i] != null)
                    num += output[i];
            }
            permNums.add(Integer.parseInt(num));
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                visit[i] = true;
                output[depth] = arr[i];
                perm(arr, visit, output, depth + 1, n, k);
                visit[i] = false;
            }

        }
    }

}
