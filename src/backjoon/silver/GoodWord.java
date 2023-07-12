package backjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class GoodWord{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0 ; i < repeat ; i++){
            String input = br.readLine();

            Stack<Character> stack = new Stack<>();

            for(int n = 0 ; n < input.length() ; n++){
                char ch = input.charAt(n);

                if(stack.size() > 0){
                    if(stack.peek() == ch){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }     
                }else{
                    stack.push(ch);
                }
                
            }

            if(stack.size() == 0) answer++;

        }

        System.out.println(answer);
    }
}