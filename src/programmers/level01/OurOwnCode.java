package programmers.level01;

import java.util.ArrayList;
import java.util.List;

//둘만의 암호
public class OurOwnCode {
    public static void main(String[] args){
//        solution("acegikmoqsuwy","bdfhjlnprtvxz",8);
        solution("ybcde","azb",1);
    }
    public static String solution(String s, String skip, int index) {
        String answer = "";

        List<Character> skips = new ArrayList<>();
        for(int i=0; i<skip.length(); i++){
            skips.add(skip.charAt(i));
        }

        for(int i=0; i<s.length(); i++){
            int word = s.charAt(i);
            for(int j=0; j<index; j++){
                word++;
                if(word > 122) word -= 26;
                while(skips.contains((char)word)){
                    word++;
                    if(word > 122) word -= 26;
                }
            }
            if(word > 122) word -= 26;
            answer += (char)word;
        }

        System.out.println(answer);
        return answer;
    }
}