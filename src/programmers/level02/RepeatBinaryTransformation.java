package programmers.level02;

//이진 변환 반복하기
public class RepeatBinaryTransformation {
    public static void main(String[] args) {
        solution("110010101001");
        solution("01110");
        solution("1111111");
    }
    public static int[] solution(String s) {
        int[] answer = new int[2];

        int zeroCnt = 0;
        int repeatCnt = 0;

        while(!s.equals("1")){
            // 0 없애기
            zeroCnt += (s.length() - s.replace("0","").length());
            s = s.replace("0","");
            // 0 없앤 s 길이 추출
            int c = s.length();
            // 다시 2진수로 변환
            s = Integer.toBinaryString(c);
            repeatCnt++;
        }

        answer[0] = repeatCnt;
        answer[1] = zeroCnt;

        System.out.println(zeroCnt+", "+repeatCnt);
        return answer;
    }
}
