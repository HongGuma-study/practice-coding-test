package programmers.level00;

import java.util.HashMap;

//주사위 게임3
public class ADiceGame3{
    public static void main(String[] args) {
        int r = solution(2,2,2,2);
        System.out.println(r);
        diceMap.clear();
        r = solution(4,1,4,4);
        System.out.println(r);
        diceMap.clear();
        r = solution(6,3,3,6);
        System.out.println(r);
        diceMap.clear();
        r = solution(2,5,2,6);
        System.out.println(r);
        diceMap.clear();
        r = solution(6,4,2,5);
        System.out.println(r);
        diceMap.clear();
    }

    static HashMap<Integer,Integer> diceMap = new HashMap<>();

    public static int solution(int a, int b, int c, int d) {

        insertData(a);
        insertData(b);
        insertData(c);
        insertData(d);

        System.out.println(diceMap);

        if(diceMap.size() == 1){
            return 1111 * a;
        }

        if(diceMap.size() == 2){
            int[] arr = new int[2];
            boolean caseChk = false;
            int p = 1, q = 1, i = 0;

            for(int key : diceMap.keySet()){
                if(diceMap.get(key) == 2){
                    caseChk = true;
                }else if(diceMap.get(key) == 3){
                    p = key;
                }else if(diceMap.get(key) == 1){
                    q = key;
                }
                arr[i++] = key;
            }
            
            if(caseChk){ // a == b != c == d;
                return (arr[0] + arr[1]) * Math.abs(arr[0] - arr[1]);
            }else{
                return (10 * p + q) * (10 * p + q);
            }

        }

        if(diceMap.size() == 3){
            int[] arr = new int[2];
            int i = 0;
            for(int key : diceMap.keySet()){
                if(diceMap.get(key) != 2){
                    arr[i++] = key;
                }
            }

            return arr[0] * arr[1];
        }

        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        
        return min;

    }

    public static void insertData(int num){
        if(diceMap.containsKey(num)){
            int cnt = diceMap.get(num);
            diceMap.put(num, ++cnt);
        }else{
            diceMap.put(num, 1);
        }
    }
}