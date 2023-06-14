package programmers.level00;

//문자열 밀기
class PushingString{
    public static void main(String[] args) {
        solution("hello", "ohell"); //1
        solution("apple", "elppa"); //-1
        solution("atat","tata"); //1
        solution("abc","abc"); //0
        
    }

    public static int solution(String A, String B) {
        int answer = 0;

        for(int i = 0 ; i < A.length() ; i++){
            if(A.equals(B)) 
                return answer;
            String last = A.substring(A.length()-1);
            A = A.substring(0, A.length() - 1);
            A = last+A;
            answer++;
        }
            
        return -1;
    }
}