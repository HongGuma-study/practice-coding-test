package programmers.level01;

import java.util.*;

//실패율
public class FailureRate {
    public static void main(String[] args) {
        solution(5,new int[]{2,1,2,6,2,4,3,3});
        solution(4,new int[]{4,4,4,4,4});
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        ArrayList<Stage> stageList = new ArrayList<>();
        ArrayList<Integer> stageArr = new ArrayList<>();
        double length = stages.length;


        for(int i=1; i<=N; i++){
            double cnt = 0;
            for(int stage : stages){
                if(i == stage){
                    cnt++;
                }
            }

            Stage stage = new Stage();

            if(cnt == 0){
                stage.idx = i;
                stage.rate = 0;
                stageList.add(stage);
            }else{
                stage.idx = i;
                stage.rate = cnt / length;
                stageList.add(stage);
            }


            length -= cnt;
        }

        Collections.sort(stageList);

        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).idx;
        }
        return answer;
    }

    static class Stage implements Comparable<Stage>{
        int idx;
        double rate;

        @Override
        public int compareTo(Stage o) {
            if(this.rate == o.rate)
                return this.idx < o.idx ? -1 : 1;
            return this.rate > o.rate ? -1 : 1;
        }

        @Override
        public String toString() {
            return "Stage{" +
                    "idx=" + idx +
                    ", rate=" + rate +
                    '}';
        }
    }
}
