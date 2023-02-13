package fastcampus.codingtest.day04;

import java.io.*;
import java.util.StringTokenizer;

public class Example4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int input = Integer.parseInt(br.readLine());

        int[] dp = new int[input];
        int[] arr = new int[input];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<input; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int max = arr[0];

        for(int i=1; i<input; i++){
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);

            if(max < dp[i]) max = dp[i];
        }

        bw.write(String.valueOf(max));
        bw.close();
    }
}
