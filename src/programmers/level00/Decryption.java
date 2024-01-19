package programmers.level00;

public class Decryption {
    public static void main(String[] args) {
        
    }

    public String solution(String cipher, int code) {
        String answer = "";
        int idx = 1;
        for(char ch :  cipher.toCharArray()){
            if(idx % code == 0){
                answer += ch;
            }
            idx++;
        }
        return answer;
    }
}
