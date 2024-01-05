package programmers.level00;

public class AddNumberOfDigits {
    public static void main(String[] args) {
        solution(1234);
        solution(930211);
        solution(1);        
        solution(10);        
        solution(11);        
    }

    public static int solution(int n){
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
        return answer;
    }
}
