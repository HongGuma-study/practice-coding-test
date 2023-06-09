package programmers.level00;

//코드 처리하기
class ProcessingCode{
    public static void main(String[] args) {
        solution("abc1abc1abc");
    }

    public static String solution(String code){
        String answer = "";

        boolean mode = false; //true 1 false 0

        for(int i=0 ; i < code.length() ; i++){
            if(code.charAt(i) == '1'){
                mode = !mode;
                continue;
            }

            if(mode){ // mode == 1;
                if(i % 2 != 0){
                    answer += code.charAt(i);
                }
            }else{ // mode == 0;
                if(i % 2 == 0){
                    answer += code.charAt(i);
                }
            }
        }

        if(answer.length() == 0) answer = "EMPTY";

        return answer;
    }
}