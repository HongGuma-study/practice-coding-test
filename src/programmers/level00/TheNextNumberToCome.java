package programmers.level00;

//다음에 올 숫자
public class TheNextNumberToCome {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
        solution(new int[]{2,4,8});
        solution(new int[]{2,2,2,2});
        solution(new int[]{2,4,6,8});
        solution(new int[]{1,4,16});
        solution(new int[]{0,1,2,3});
    }

    public static int solution(int[] common) {
        int answer = 0;

        //공차 구하기
        int d = common[1] - common[0];
        //공비 구하기
        int r = 1;
        if(common[0] != 0) r = common[1] / common[0];
        
        if(common[2] == (common[0] + 2*d)){
            //등차 수열
            answer = common[0] + (common.length) * d;
        }else{
            //등비 수열 
            answer = common[0] * (int) (Math.pow(r, (common.length)));
        }

        System.out.println(answer);
        return answer;
    }
}
