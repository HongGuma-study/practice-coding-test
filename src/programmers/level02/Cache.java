package programmers.level02;

import java.util.*;

import javax.swing.RowFilter.Entry;
import javax.swing.text.html.parser.Entity;


//[1차] 캐시 문제
class Cache{

    public static void main(String[] args) {
        // solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        // solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        // solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        // solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        // solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
        // solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        // solution(3, new String[]{"Jeju", "Pangyo", "Jeju", "Seoul", "NewYork", "Jeju", "LA", "NewYork"}); //28
        solution(1, new String[]{"1", "1", "1", "2", "1"});
    }

    

    public static int solution(int cacheSize, String[] cities){
        int answer = 0;

        HashMap<String, Integer> cache = new HashMap<>();

        int value = 0;

        for(String city : cities){
            value++;
            System.out.println(city);
            String lowerCity = city.toLowerCase();

            if(cacheSize == 0){
                answer += 5;
                continue;
            }

            if(cache.size() == 0){
                cache.put(lowerCity, value);
                answer += 5;
                System.out.println(cache);
                continue;
            }

            //hit 일 때
            if(cache.containsKey(lowerCity)){
                cache.put(lowerCity, value);
                answer += 1;
            }
            else{ //miss 일 때
                if(cache.size() >= cacheSize){
                    String minKey = "";
                    if(cache.size() > 1)
                        minKey = Collections.min(cache.entrySet(), (o1, o2) -> o1.getValue() - o2.getValue()).getKey();
                    else if(cache.size()  == 1){
                        for(String key : cache.keySet())
                            minKey = key;
                    }
                    cache.remove(minKey);
                }
                cache.put(lowerCity,value);
                answer += 5;
            }
            
            System.out.println(cache);
        }

        System.out.println(answer);
        return answer;
    }
}