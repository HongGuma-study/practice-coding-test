package programmers.level00;

public class StringInsideString {
    public static void main(String[] args) {
        int result = solution("ab6CDE443fgh22iJKlmn1o","6CD");
        System.out.println(result);
        result = solution("ppprrrogrammers","pppp");
        System.out.println(result);
        result = solution("AbcAbcA","AAA");
        System.out.println(result);
        result = solution("abcd","cd");
        System.out.println(result);
    }

    public static int solution(String str1, String str2){
        
        int s=0, e=str2.length();
        
        while(e < str1.length()+1){
            if(str1.substring(s,e).equals(str2)){
                return 1;
            }else{
                s++;
                e++;
            }
        }
        
        return 2;
    
    }
    
}
