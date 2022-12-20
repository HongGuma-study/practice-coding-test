package programmers.level02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//타겟넘버
public class TargetNumber {
    public static void main(String[] args) {
        solution(new int[]{1,1,1,1,1},3);
        solution(new int[]{4,1,2,1},4);
    }
    static int[] nums;
    static int answer;

    public static int solution(int[] numbers, int target) {
        answer = 0;
        nums = numbers;
        bfs(0,target,0);

        return answer;
    }

    public static void bfs(int depth, int target, int sum){
        if(depth == nums.length){
            if(target == sum) answer++;
            return;
        }

        bfs(depth + 1, target, sum + nums[depth]);
        bfs(depth + 1, target, sum - nums[depth]);
    }
}
