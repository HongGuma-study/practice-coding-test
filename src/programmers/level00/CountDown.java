package programmers.level00;

public class CountDown {
    public static void main(String[] args) {
        
    }

    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int idx = 0;
        for(int i = start+1 ; i > end_num ; i--){
            answer[idx++] = i - 1; 
        }
        return answer;
    }
}
