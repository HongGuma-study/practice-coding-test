package programmers.level02;

import java.util.*;

//영어 끝말잇기
public class WordChainInEnglish {
    public static void main(String[] args) {
        solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};

        ArrayList<String> lastWords = new ArrayList<>();

        int people = 0;
        int round = 0;
        int cnt = 0;
        for( int i = 0 ; i < words.length ; i++ ){
            people = i % n; // 사람 번호
            if(cnt % n == 0) round++; // 차례
            cnt++;

            if(i == 0){
                lastWords.add(words[i]);
                continue;
            }

            //중복 찾기
            if(lastWords.contains(words[i])){
                answer[0] = people + 1;
                answer[1] = round;
                break;
            }else{
                //끝말 잇기
                String lastWord = lastWords.get(i-1);
                if(lastWord.charAt(lastWord.length()-1) != words[i].charAt(0)){
                    answer[0] = people + 1;
                    answer[1] = round;
                    break;
                }
            }
            lastWords.add(words[i]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
