package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//카카오 1차 다트 게임
public class DartsGame {
    public static void main(String[] args) {
        solution("1S2D*3T");
        solution("1D2S#10S");
        solution("1D2S0T");
        solution("1S*2T*3S");
        solution("1D#2S*3S");
        solution("1T2D3D#");
        solution("1D2S3T*");
    }

    public static int solution(String dartResult) {
        int answer = 0;

        String[] numsToken = dartResult.split("[A-Z*#]");
        String[] strsToken = dartResult.split("[0-9]");

        int[] scores = new int[3];

        int i=0;
        for(String strNum : numsToken){
            if(!strNum.equals("")){
                scores[i] = Integer.parseInt(strNum);
                i++;
            }
        }

        int num = 0;
        for(String str : strsToken){
            if(str.equals("")) continue;

            if(!str.matches(".*[*#].*")){
                switch (str) {
                    case "S":
                        scores[num] = (int) Math.pow(scores[num], 1);
                        break;
                    case "D":
                        scores[num] = (int) Math.pow(scores[num], 2);
                        break;
                    case "T":
                        scores[num] = (int) Math.pow(scores[num], 3);
                        break;
                }
            }else{
                char zone = str.charAt(0);
                char op = str.charAt(1);

                switch (zone){
                    case 'S':
                        scores[num] = (int) Math.pow(scores[num], 1);
                        break;
                    case 'D':
                        scores[num] = (int) Math.pow(scores[num], 2);
                        break;
                    case 'T':
                        scores[num] = (int) Math.pow(scores[num], 3);
                        break;
                }

                if(op == '*'){
                    scores[num] *= 2;
                    if(num > 0) scores[num-1] *= 2;
                }else{
                    scores[num] = scores[num] * -1;
                }
            }
            num++;
        }

        for(int score : scores){
            answer += score;
        }

        System.out.println(Arrays.toString(scores) +" = "+answer);

        return answer;
    }
}
