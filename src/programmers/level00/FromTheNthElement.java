package programmers.level00;

public class FromTheNthElement {
    public static void main(String[] args) {
        solution(new int[]{2,1,6}, 3);
        solution(new int[]{5,2,1,7,5},2);
    }

    public static int[] solution(int[] num_list, int n) {
        int size = num_list.length - n + 1;
        
        int[] answer = new int[size];
        int idx = 0;
        for(int i = n - 1 ; i < num_list.length ; i++){
            answer[idx++] = num_list[i];
        }
        
        
        return answer;
    }
    
}
