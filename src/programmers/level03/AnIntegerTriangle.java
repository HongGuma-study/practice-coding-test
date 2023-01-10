package programmers.level03;

import java.util.ArrayList;
import java.util.Arrays;

public class AnIntegerTriangle {
    public static void main(String[] args) {
        solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
    }

    public static int solution(int[][] triangle){
        int answer;

        ArrayList<int[]> dy = new ArrayList<>();

        dy.add(triangle[triangle.length-1]);

        int dyIdx = 0;

        for(int i=triangle.length-1; i>=0; i--){
            int[] sum = new int[triangle[i].length-1];
            int[] tmp = dy.get(dyIdx);
            if(i != 0){
                for(int j=1; j < triangle[i].length; j++){
                    sum[j-1] = Math.max(tmp[j]+triangle[i-1][j-1],tmp[j-1]+triangle[i-1][j-1]);
                }

            }
            dy.add(sum);
            dyIdx++;
        }

        answer = dy.get(dyIdx-1)[0];

        return answer;
    }
}
