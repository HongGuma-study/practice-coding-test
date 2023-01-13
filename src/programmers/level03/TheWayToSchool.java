package programmers.level03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//등굣길
public class TheWayToSchool {
    public static void main(String[] args) {
        solution(4,3,new int[][]{{2,2}}); //4
    }


    public static int solution(int m, int n, int[][] puddles){
        int[][] map = new int[n+1][m+1];

        //웅덩이
        for(int[] col : puddles){
            map[col[1]][col[0]] = -1;
        }

        if(map[2][1] == 0) map[2][1] = 1;
        if(map[1][2] == 0) map[1][2] = 1;

        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[i].length; j++){
                if(map[i][j] == -1) continue;
                if(map[i-1][j] != -1) map[i][j] = ( map[i][j] + map[i-1][j] ) % 1000000007;
                if(map[i][j-1] != -1) map[i][j] = ( map[i][j] + map[i][j-1] ) % 1000000007;
            }
        }

        System.out.println(map[n][m]);
        return map[n][m];
    }


}
