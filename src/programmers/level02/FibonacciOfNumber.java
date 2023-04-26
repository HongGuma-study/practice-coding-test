package programmers.level02;

//피보나치 수
public class FibonacciOfNumber {
    public static void main(String[] args) {
        solution(3);
        solution(5);
        solution(1213);
        solution(87);
    }

    public static int solution(int n) {
        int answer = 0;

        int[] dp = new int[100001];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        answer = dp[n];
        System.out.println(answer);
        return answer;
    }
}
