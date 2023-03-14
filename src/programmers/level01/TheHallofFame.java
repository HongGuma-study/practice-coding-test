package programmers.level01;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class TheHallofFame {
    public static void main(String[] args) {
        System.out.println(solution(3,new int[]{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(solution(4,new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }

    public static ArrayList<Integer> solution(int k, int[] score){
        ArrayList<Integer> answer = new ArrayList<>();

        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for(int s : score){
            if(hallOfFame.size() < k){
                hallOfFame.add(s);
            }else{
                if(hallOfFame.peek() < s){
                    hallOfFame.poll();
                    hallOfFame.add(s);
                }
            }
            answer.add(hallOfFame.peek());
        }

        return answer;
    }
}
