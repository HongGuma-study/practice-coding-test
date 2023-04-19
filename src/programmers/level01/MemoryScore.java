package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;

public class MemoryScore {
    public static void main(String[] args) {
        solution(new String[]{"may", "kein", "kain", "radi"},new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});

    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];

        HashMap<String,Integer> memoryMap = new HashMap<>();

        for(int i=0; i< name.length; i++){
            memoryMap.put(name[i],yearning[i]);
        }

        int n = 0;
        for(String[] line : photo){
            int sum = 0;
            for(String people : line){
                if(memoryMap.containsKey(people)){
                    sum += memoryMap.get(people);
                }
            }
            answer[n] = sum;
            n++;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
