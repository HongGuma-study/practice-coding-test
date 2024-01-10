package programmers.level00;

public class TheFirstNegativeNumber {
    public static void main(String[] args) {
        
    }

    public static int solution(int[] num_list) {
        int answer = -1;

        int idx = 0;
        for(int num : num_list){
            if(num < 0) return idx;
            idx++;
        }
        
        return answer;
    }
    
}
