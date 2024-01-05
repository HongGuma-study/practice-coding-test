package programmers.level00;

public class AddtionHiddenNumber {

    public static void main(String[] args) {
        solution("aAb1B2cC34oOp");
        solution("1a2b3c4d123");
    }

    public static int solution(String my_string){
        int answer = 0;

        my_string = my_string.toLowerCase();

        for(char ch : my_string.toCharArray()){
            if(ch >= 97 && ch <= 122) continue;
            // System.out.println(ch);
            // System.out.println((int)ch);
            String str = ch + "";
            answer += Integer.parseInt(str);
        }


        System.out.println(answer);
        return answer;
    }
    
}
