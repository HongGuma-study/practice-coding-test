package programmers.level00;

import java.util.ArrayList;
import java.util.Arrays;

//배열 만들기2
public class CreateArray2 {
    public static void main(String[] args) {
        solution(5, 555); // 5 50 55 500 505 550 555
        solution(10, 20); // -1 
    }

    public static int[] solution(int l, int r) {
        int[] answer = {};

        ArrayList<Integer> fiveArr = new ArrayList<>();

        for(int i = l ; i <= r ; i++){
            if( i % 5 != 0 ) continue;
            
            String num = String.valueOf(i).replaceAll("[0,5]","");
            if(num.length() == 0) fiveArr.add(i);
        }        

        if(fiveArr.size() == 0) answer = new int[]{-1};
        else answer = fiveArr.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
