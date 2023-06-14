package programmers.level00;

import java.util.Scanner;

//대소문자 바꿔서 출력하기
public class PrintCaseByCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0 ; i < a.length() ; i ++){
            if(a.charAt(i) >= 65 && a.charAt(i) <= 90){
                System.out.print((char)(a.charAt(i) + 32));
            }else{
                System.out.print((char)(a.charAt(i) - 32));
            }
        }
    }
    
}
