package fastcampus.codingtest.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//파이프 옮기기
public class Example3 {
    static int N;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        input();

    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
    }

}
