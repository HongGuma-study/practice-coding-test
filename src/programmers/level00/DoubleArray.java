package programmers.level00;

public class DoubleArray {
    public static void main(String[] args) {
        
    }

    public static int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];

        int i = 0;
        for(int num : numbers){
            answer[i++] = num * 2;
        }

        return answer;
    }
    
}
