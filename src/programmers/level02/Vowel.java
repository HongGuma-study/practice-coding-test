package programmers.level02;

import java.util.Objects;

public class Vowel {
    public static void main(String[] args) {
        int answer = solution("AAAAE");
        System.out.println(answer);
//        solution("AAAE");
//        solution("I");
//        solution("EIO");

    }


    static int answer = 0;
    static String[] vowels = {"A","E","I","O","U"};

    public static int solution(String word){

        for(String vowel : vowels){
            if(dfs(vowel,word)) return answer;
        }

        return answer;
    }

    public static boolean dfs(String vowel, String word){
        answer++;
        System.out.println(vowel);
        if(Objects.equals(vowel, word)) return true;

        if(vowel.length() == 5) return false;

        for(String addVowel : vowels){
            if(dfs(vowel+addVowel,word)) return true;
        }

        return false;
    }
}
