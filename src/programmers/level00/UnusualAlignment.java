package programmers.level00;

import java.util.*;

public class UnusualAlignment {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        solution(new int[]{10000,20,36,47,40,6,10,7000}, 30);
        solution(new int[]{10, 2}, 6); // 10 2
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Integer> numArr = new ArrayList<>();

        for(int num : numlist) numArr.add(num);
        
        Collections.sort(numArr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if( Math.abs( o1 - n ) > Math.abs( o2 - n ) ){
                    return 1;
                }else if( Math.abs( o1 - n ) == Math.abs( o2 - n ) ){
                    if(o1 > o2) return -1;
                    else return 1;
                }
                return -1;
                
            }
        });
        System.out.println(numArr);
        
        answer = numArr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
