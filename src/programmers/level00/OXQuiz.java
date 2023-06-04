package programmers.level00;

import java.util.Arrays;

class OXQuiz{
    public static void main(String[] args) {
        solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int a = 0, b = 0, result = 0;
        
        for(int i = 0 ; i < quiz.length ; i++){
            String[] el = quiz[i].split(" ");
            a = Integer.parseInt(el[0]);
            b = Integer.parseInt(el[2]);
            result = Integer.parseInt(el[4]);
            if(el[1].equals("+")){
                if(a + b == result) answer[i] = "O";
                else answer[i] = "X";
            }else{
                if(a - b == result) answer[i] = "O";
                else answer[i] = "X";
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}