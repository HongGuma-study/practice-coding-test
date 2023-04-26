package programmers.level02;

//다음 큰 숫자
public class NextBigNumber {
    public static void main(String[] args) {
        solution(78);
        solution(15);
    }

    public static int solution(int n) {
        int answer = 0;

        String binary = Integer.toBinaryString(n);

        int oenNum = CountNumberOfOen(binary);
        int nextNum = 0;

        while(oenNum != nextNum){
            n++;
            String nextBinary = Integer.toBinaryString(n);
            nextNum = CountNumberOfOen(nextBinary);
        }

        answer = n;
        System.out.println(answer);
        return answer;
    }

    public static int CountNumberOfOen(String binary){
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1') count++;
        }

        return count;
    }
}
