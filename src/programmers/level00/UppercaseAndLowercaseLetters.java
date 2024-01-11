package programmers.level00;

public class UppercaseAndLowercaseLetters {
    public static void main(String[] args) {
        solution("cccCCC");
        solution("abCdEfghIJ");
    }

    public static String solution(String my_string){
        String answer = "";

        for(char ch : my_string.toCharArray()){
            if(ch >= 97){ //소문자
                answer += (char)(ch - 32); 
            }else{ //대문자
                answer += (char)(ch + 32);
            }
        }

        return answer;
    }
}
