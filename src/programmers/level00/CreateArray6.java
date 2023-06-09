package programmers.level00;

import java.util.ArrayList;

//배열 만들기6
public class CreateArray6 {
    public static void main(String[] args) {
        solution(new int[]{0, 1, 1, 1, 0});
        solution(new int[]{0, 1, 0, 1, 0});
        solution(new int[]{0, 1, 1, 0});
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> stk = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            }else{
                if(stk.get(stk.size()-1) == arr[i]){
                    stk.remove(stk.size()-1);
                }else{
                    stk.add(arr[i]);
                }
            }
        }

        System.out.println(stk);
        return answer;
    }
}

