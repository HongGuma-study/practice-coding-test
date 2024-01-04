package programmers.level00;

public class NCharacterBeforeString {
    public static void main(String[] args) {
           
    }

    public String solution(String my_string, int n) {
        String answer = "";
        
        answer = my_string.substring(0,n);
       
        return answer;
    }
    
}
