package programmers.level00;

//저주의 숫자 3
public class TheCurseNumber3 {
    public static void main(String[] args) {
        solution(15);
        solution(40);
        solution(100); //185
        
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1 ; i <= n ; i++){
            answer++;
            while(answer % 3 == 0 || answer / 10 == 3 || answer % 10 == 3 || answer / 10 == 13) 
            answer++;
        }  
        
        System.out.println(answer);
        return answer;
    }
}
