package programmers.level02;

import java.util.Stack;

//점프와 순간이동
public class JumpAndTeleportation {
    public static void main(String[] args) {
        solution(5); //2
        solution(6); //2
        solution(5000); //5
    }

    public static int solution(int n) {
        int ans = 0;

        int position = n;

        while(position > 0){
            if(position % 2 != 0){
                position--;
                ans++;
            }
            position = position / 2;
        }

        System.out.println(ans);
        return ans;
    }


}
