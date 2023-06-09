package programmers.level00;

import java.util.ArrayList;

//배열 조각하기
public class FragmentingAnArray {
    public static void main(String[] args) {
        solution(new int[]{0,1,2,3,4,5}, new int[]{4,1,2}); // 1,2,3
        solution(new int[]{0,1,2,3,4,5,6,7}, new int[]{4,1,2}); // 1,2,3
    }

    public static ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();
       
        for(int a : arr){
            answer.add(a);
        }
        
        int num = 0;

        for(int q : query){
            if(num % 2 == 0){ //짝수 인덱스
                //뒤에 자르기
                int idx = answer.size() - 1;
                for(int i = idx ; i > q ; i--){
                    answer.remove(i);
                }
            }else{ //홀수 인덱스
                //앞에 자르기
                for(int i = 0 ; i < q ; i++){
                    answer.remove(0);
                }
            }
            num++;
        }
    
        System.out.println(answer);
        return answer;
    }
    
}
