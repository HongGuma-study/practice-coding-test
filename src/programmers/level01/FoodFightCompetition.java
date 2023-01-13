package programmers.level01;

//푸드 파이트 대회
public class FoodFightCompetition {
    public static void main(String[] args) {
        solution(new int[]{1,3,4,6});
        solution(new int[]{1,7,1,2});
    }

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer.append(i);
            }
        }

        answer.append("0");

        for(int i = food.length - 1; i > 0; i--){
            for(int j=0; j<food[i]/2; j++){
                answer.append(i);
            }
        }

        return answer.toString();
    }
}
