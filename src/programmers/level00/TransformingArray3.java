package programmers.level00;

public class TransformingArray3 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int i = 0;
        if(k % 2 == 0){
            for(int num : arr){
                answer[i++] = num + k;
            }
        }else{
            for(int num : arr){
                answer[i++] = num * k;
            }
        }
        return answer;
    }
}
