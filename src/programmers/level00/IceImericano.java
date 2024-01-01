package programmers.level00;

public class IceImericano {
    public static void main(String[] args) {
        solution(3000);
        solution(5500);
        solution(15000);
    }

    public static int[] solution(int money){
        int[] answer = new int[2];

        int cup = 0; //컵
        int change = 0; //잔돈

        if(money < 5500){
            answer[0] = 0;
            answer[1] = money;
            System.err.println(answer[0] +", "+answer[1]);
            return answer;
        }

        while(money >= 5500){
            change = money - 5500;
            money -= 5500;
            cup++;
        }

        answer[0] = cup;
        answer[1] = change;

        System.err.println(answer[0] +", "+answer[1]);

        return answer;
    }
    
}
