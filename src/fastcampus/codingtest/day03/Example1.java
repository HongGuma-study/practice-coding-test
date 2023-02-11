package fastcampus.codingtest.day03;

import java.io.*;

public class Example1 {

    static final int[] dp = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=num; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        bw.write(String.valueOf(dp[num]));
        bw.close();
    }


}
