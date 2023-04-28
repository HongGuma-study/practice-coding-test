package programmers.level02;

import java.util.Stack;

//짝지어 제거하기
public class RemovingThePair {
    public static void main(String[] args) {
        solution("baabaa");
        solution("cdcd");
    }

    public static int solution(String s){
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            stack.push(s.charAt(i));

            if(stack.size() >= 2){
                char m = stack.pop();
                char n = stack.pop();

                if(m != n){
                    stack.push(n);
                    stack.push(m);
                }
            }

        }

        if(stack.size() == 0) answer = 1;

        System.out.println(answer);

        return answer;
    }
}
