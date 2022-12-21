package programmers.level01;

import java.util.ArrayList;

// 삼총사
public class Trio {
    public static void main(String[] args) {
        solution(new int[]{-2,3,0,2,-5});
        answers.clear();
        solution(new int[]{-3,-2,-1,0,1,2,3});
        answers.clear();
        solution(new int[]{-1,1,-1,1});
    }

    static boolean[] visited;
    static int[] numbers;
    static int[] output;
    static ArrayList<Integer> answers = new ArrayList<>();

    public static int solution(int[] number){
        int answer = 0;
        numbers = number;
        visited = new boolean[number.length];
        output = new int[number.length];
        perm(0, number.length, 3);

        for(int a : answers){
            if(a == 0) answer++;
        }
        System.out.println(answers);
        System.out.println(answer);
        return answer;
    }

    public static void perm(int depth, int n, int r){
        if(depth == r){
            int sum = 0;
            for(int num : output){
                sum += num;
            }
            answers.add(sum);
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = numbers[i];
                perm(depth+1, i, r);
                visited[i] = false;
            }
        }
    }
}
