package programmers.level00;

public class NumberControl {
    public static void main(String[] args) {
        solution(0, "wsdawsdassw");
    }

    public static int solution(int n, String control) {
        
        for(char ch : control.toCharArray()){
            switch(ch){
                case 'w': 
                    n += 1;
                    break;
                case 's': 
                    n -= 1;
                    break;
                case 'd': 
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        
        System.out.println(n);
        return n;
    }
}
