package programmers.level00;

public class CountUp {
    public static void main(String[] args) {
        
    }

    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num + 1;
        int[] answer = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            answer[i] = start_num++;
        }
        
        return answer;
    }
}
