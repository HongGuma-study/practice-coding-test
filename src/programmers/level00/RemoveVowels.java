package programmers.level00;

public class RemoveVowels {
    public static void main(String[] args) {
        
    }

    public String solution(String my_string){
        String answer = "";

        for(char ch : my_string.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            answer += ch;
        }

        return answer;
    }
}
