
package programmers.level00;

/**
 * LargerCombination
 */
public class LargerCombination {

    public static void main(String[] args) {
        solution(9, 91);
        solution(89, 8);
    }

    public static int solution(int a, int b) {
        int answer = 0;

        String num1 = String.valueOf(a) + String.valueOf(b);
        String num2 = String.valueOf(b) + String.valueOf(a);

        answer = Integer.parseInt(num1) > Integer.parseInt(num2) ? Integer.parseInt(num1) : Integer.parseInt(num2);
        
        System.out.println(answer);
        return answer;
    }
}