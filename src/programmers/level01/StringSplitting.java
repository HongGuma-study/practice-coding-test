
package programmers.level01;

/**
 * StringSplitting
 */
public class StringSplitting {

    public static void main(String[] args) {
        
    }

    public int solution(String s) {
        int answer = 0;
        
        while(s.length() > 0){
            char pointCh = s.charAt(0);
            s = s.substring(0, 1);
            System.out.println(s);
            
            int pointChCnt = 1, elseCh = 0;

            for(char ch : s.toCharArray()){
                if(ch == pointCh){
                    pointChCnt++;
                }else{
                    elseCh++;
                }

                if(pointCh == elseCh) break;
            }

            
        }
        return answer;
    }
}