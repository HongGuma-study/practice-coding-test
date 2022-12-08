package programmers.level02;

public class Hindex {
    public static void main(String[] args) {
        solution(new int[]{3, 0, 6, 1, 5});
        solution(new int[]{0,1,1});
        solution(new int[]{4,4,4});
    }
    public static int solution(int[] citations) {
        int answer = 0;

        for(int i=0; i<citations.length; i++){
            int cnt = 0; // h이상인 논문 개수
            for(int citation : citations){
                if(citation >= i){
                    cnt++;
                }
            }
            if(cnt >= i){

                answer = i;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
