
package programmers.level00;

import java.util.ArrayList;

/**
 * HateEvenNumber
 */
public class HateEvenNumber {

    public static void main(String[] args) {
        solution(10);
        solution(15);
    }

    public static ArrayList<Integer> solution(int n){
        ArrayList<Integer> ansArr = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            if(i % 2 != 0) ansArr.add(i);
        }
        
        System.out.println(ansArr);
        return ansArr;
    }
}