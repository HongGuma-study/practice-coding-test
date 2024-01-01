package programmers.level00;

public class RepeatTextOutput {
    public static void main(String[] args) {
        solution("hello", 3);
    }

    public static String solution(String my_string, int n){
        String answer = "";
        
        
        for(int j = 0 ; j < my_string.length() ; j++){
            char ch = my_string.charAt(j);
            for(int i = 0 ; i < n ; i++){
                answer += ch;
            }
        }
       
        System.out.println(answer);
        return answer;
    }
}
