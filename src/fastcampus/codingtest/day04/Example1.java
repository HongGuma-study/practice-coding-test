package fastcampus.codingtest.day04;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        int input = Integer.parseInt(br.readLine());

        int[] dx = new int[input+1];

        dx[0] = 1;
        dx[1] = 2;

        for(int i=2; i<=input; i++){
            dx[i] = (dx[i-2] + dx[i-1]) % 10007;
        }

        answer = dx[input-1];

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
