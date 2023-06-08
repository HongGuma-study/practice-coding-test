package programmers.level00;

import java.util.Arrays;

//다항식 더하기
public class PolynomialAddition {
    public static void main(String[] args) {
        solution("3x + 7 + x");
        solution("x + x + x");
        solution("7");
        solution("x + 2x + 3x + 1 + 2 + 3");
        solution("x + 1 + 2 + 3");
    }

    public static String solution(String polynomial) {
        String answer = "";

        String[] split = polynomial.split(" ");

        int sum = 0, numSum = 0;

        for(String str : split){
            if(str.indexOf("x") != -1){
                if(str.length() == 1) sum += 1;
                else{
                    str = str.substring(0, str.length()-1);
                    sum += Integer.parseInt(str);
                }
            }else{
                if(!str.equals("+")){
                    numSum += Integer.parseInt(str);
                }
            }
        }
        
        if(sum != 0){
            if(sum == 1) answer += "x";
            else answer += sum + "x";
            if(numSum != 0) answer += " + " + numSum;
        }else{
            if(numSum != 0) answer += numSum;
        }


        System.out.println(answer);
        return answer;
    }
    
}
