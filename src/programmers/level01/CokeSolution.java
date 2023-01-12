package programmers.level01;

//콜라 문제
public class CokeSolution {
    public static void main(String[] args) {
        solution(2,1,20); //19
        solution(3,1,20); //9
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        // a : 줘야할 빈 병
        // b : 주는 콜라
        // n : 총 들고간 빈 병
        // n < a 이면 더 이상 진행 x

        int bottle = n;

        while(bottle >= a){
            int giveBottle = (bottle/a) * b;
            int leaveBottle = bottle%a;
            bottle = bottle - (bottle-leaveBottle) + giveBottle;
            answer += giveBottle;
        }


        System.out.println(answer);
        return answer;
    }


}
