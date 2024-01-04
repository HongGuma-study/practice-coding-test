package programmers.level00;

public class BacterialGrowth {
    public static void main(String[] args) {
        solution(2,10);
        solution(7,15);
    }

    public static int solution(int n, int t) {
        int answer = 0;

        answer = (int) Math.pow(n, t+1);

        System.out.println(answer);
        return answer;
    }
}
