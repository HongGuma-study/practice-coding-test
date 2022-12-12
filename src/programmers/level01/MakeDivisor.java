package programmers.level01;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//소수 만들기
public class MakeDivisor {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
        solution(new int[]{1,2,7,6,4});
    }

    static ArrayList<Integer> madeNumbers = new ArrayList<>();

    static boolean[] visited;
    static int[] output;

    public static int solution(int[] nums) {
        int answer = 0;

        visited = new boolean[nums.length];
        output = new int[nums.length];

        comb(nums,output,0,0,3);

        System.out.println(madeNumbers);

        for(int num : madeNumbers){
            if(num == 1 || num == 0) continue;
            int cnt = 0;
            for(int i=1; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    cnt++;
                    if(i != num/i) cnt++;
                }
            }
            if(cnt == 2){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    //index : 어디까지 뽑았는지, r : 몇개 뽑을 건지
    public static void comb(int[] arr, int[] output, int depth, int index, int r) {
        if(r == 0){
            int sum = 0;
            for(int i=0; i<3; i++){
                System.out.print(output[i]+", ");
                sum += output[i];
            }
            madeNumbers.add(sum);
            System.out.println();
        }else if(depth == arr.length){
            return;
        }else{
            output[index] = arr[depth];
            comb(arr,output,depth + 1, index + 1, r - 1);

            comb(arr,output,depth + 1, index, r);
        }
    }
}
