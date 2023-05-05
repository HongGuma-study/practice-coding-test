package programmers.level02;

import java.util.*;
import java.util.concurrent.TransferQueue;

//귤 고르기 문제
public class SelectTangerine {
    public static void main(String[] args) {
        solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3});
    }

    public static int solution(int k, int[] tangerines) {
        int answer = 0;

        HashMap<Integer, Integer> tangerineMap = new HashMap<>();

        for(int t : tangerines){
            if(tangerineMap.containsKey(t)){
                int cnt = tangerineMap.get(t);
                tangerineMap.put(t,++cnt);
            }else{
                tangerineMap.put(t,1);
            }
        }
        
        // HashMap은 정렬이 안돼서 큐에 넣어서 정렬함
        PriorityQueue<Tangerine> tangerineQueue = new PriorityQueue<>();

        for( int key : tangerineMap.keySet() ){
            tangerineQueue.add( new Tangerine(key, tangerineMap.get(key)) );
        }

        while(k > 0){
            Tangerine tmp = tangerineQueue.poll();
            k -= tmp.count;
            answer++;
        }

        System.out.println(answer);
       
        return answer;
    }

    static class Tangerine implements Comparable<Tangerine> {
        int num;
        int count;

        public Tangerine(int n, int c){
            this.num = n;
            this.count = c;
        }

        @Override
        public int compareTo(Tangerine o) {
            if(this.count == o.count)
                return this.num < o.num ? -1 : 1;
            return this.count > o.count ? -1 : 1;
        }
        
        @Override
        public String toString() {
            return "num : "+this.num+", count : " + this.count;
        }
    }
}
