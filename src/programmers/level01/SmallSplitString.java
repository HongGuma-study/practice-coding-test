package programmers.level01;

import java.util.ArrayList;

//크기가 작은 부분 문자열
public class SmallSplitString {
    public static void main(String[] args) {
        solution("3141592", "271"); //2
        solution("500220839878", "7"); //8
    }

    public static int solution(String t, String p) {
        int answer = 0;

        ArrayList<String> splitNums = new ArrayList<>();

        int len = p.length();

        for(int i=0; i<t.length(); i++){
            String num = "";
            num += t.charAt(i);
            for(int j=i+1; j<t.length(); j++){
                if(num.length() >= len) break;
                num += t.charAt(j);
            }
            if(num.length() == len) splitNums.add(num);
        }
//        System.out.println(splitNums);

        for(String n : splitNums){
            if(n.compareTo(p) <= 0) answer++;
        }


        System.out.println(answer);
        return answer;
    }
}
