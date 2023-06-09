package programmers.level00;

public class ChickenCoupon {
    public static void main(String[] args) {
        solution(100);
        solution(1081);
    }

    public static int solution(int chicken) {
        int answer = 0;
        
        int coupon = chicken;

        while(coupon > 0){
            int service = coupon / 10;
            coupon = coupon % 10;
            coupon += service;
            answer += service;
            if(service == 0 && coupon < 10) break;
        }

        System.out.println(answer);
        
        return answer;
    }
    
}
