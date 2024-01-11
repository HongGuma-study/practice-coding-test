package programmers.level00;

public class AnArmyOfAnts {
    public static void main(String[] args) {
        solution(23);
        solution(24);
        solution(999);

    }

    public static int solution(int hp){
        int answer = 0;

        while(hp > 0){
            if(hp >= 5){
                hp -= 5;
                answer++;
            }else if(hp >= 3){
                hp -= 3;
                answer++;
            }else{
                hp -= 1;
                answer++;
            }
        }

        return answer;
    }
}
