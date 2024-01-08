package programmers.level00;

public class AttachANumber {
    public static void main(String[] args) {
        solution(new int[]{3,4,5,2,1});
        solution(new int[]{5,7,8,3});
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        String even = "", odd = "";

        for(int num : num_list){
            if(num % 2 == 0)
                even += String.valueOf(num);
            else
                odd += String.valueOf(num);
        }

        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}
