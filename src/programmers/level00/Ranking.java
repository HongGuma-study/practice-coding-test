package programmers.level00;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//등수 매기기
public class Ranking {
    public static void main(String[] args) {
        solution(new int[][]{{80,70},{90,50},{40,70},{50,80}});
        solution(new int[][]{{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}});
        solution(new int[][]{{100,100},{100,100},{100,100},{100,100},{100,100},{100,100},{100,100}});
        solution(new int[][]{{0,0},{100,100},{100,100},{100,100},{100,100},{100,100},{100,100}});
        solution(new int[][]{{0,0},{71,53},{71,52},{100,100},{100,100},{100,100},{100,100}});
        solution(new int[][]{{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}});
        solution(new int[][]{{0, 20}, {10, 10}, {30, 0}, {10, 11}, {0, 30}, {14, 6}, {15, 15}}); // 5, 5, 1, 4, 1, 5, 1
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        int idx = 0;
        for(int[] row : score){
            if(row[0] + row[1] != 0)
                avg[idx] = (double) (row[0] + row[1]) / (double) 2;
            else avg[idx] = 0;
            idx++;
        }
        System.out.println(Arrays.toString(avg));
        PriorityQueue<Student> queue = new PriorityQueue<>();

        for(int i = 0 ; i < avg.length ; i++){
            queue.add(new Student(i, avg[i], 1));
        }

        Student prev = null;
        int rank = 1;

        while(!queue.isEmpty()){
            Student now = queue.poll();
            if(prev != null){
                if(now.score == prev.score){
                    answer[now.idx] = prev.rank;
                    now.rank = prev.rank;
                }else{
                    answer[now.idx] = rank;
                    now.rank = rank;
                }
                rank++;
            }else{
                answer[now.idx] = rank;
                now.rank = rank;
                rank++;
            }
            prev = now;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    static class Student implements Comparable<Student>{
        int idx;
        double score;
        int rank;

        public Student(int idx, double score, int rank){
            this.idx = idx;
            this.score = score;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "{ idx = "+idx+", score = "+score+", rank = "+rank+" }";
        }

        @Override
        public int compareTo(Student o) {
            return this.score <  o.score ? 1 : -1;
        }
    }
}
