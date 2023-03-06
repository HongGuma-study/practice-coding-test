package programmers.level01;

public class SevenCount {
    public static void main(String[] args) {

    }

    public int solution(int[] array){
        int answer = 0;

        for(int num : array){
            String strNum = String.valueOf(num);

            for(int i=0; i<strNum.length(); i++){
                if(strNum.charAt(i) == 55) answer++;
            }

        }
        return answer;
    }
}
