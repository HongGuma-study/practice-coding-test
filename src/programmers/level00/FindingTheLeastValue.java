package programmers.level00;

import java.util.HashMap;

public class FindingTheLeastValue {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,3,3,4});
        solution(new int[]{1,1,2,2});
        solution(new int[]{1});
    }

    public static int solution(int[] array) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : array){
            if(map.containsKey(n)){
                int cnt = map.get(n) + 1;
                map.put(n, cnt);
            }else{
                map.put(n, 1);
            }
        }

        System.out.println(map);

        int maxValue = map.get(array[0]), maxKey = array[0];
        int cnt = 0;

        for(int key : map.keySet()){
            if(map.get(key) > maxValue){
                maxValue = map.get(key);
                maxKey = key;
            }
        }

        for(int key : map.keySet()){
            if(maxValue == map.get(key)) cnt++;
        }

        if(cnt > 1) return -1;
        System.out.println(maxKey);
        return maxKey;
    }
}
