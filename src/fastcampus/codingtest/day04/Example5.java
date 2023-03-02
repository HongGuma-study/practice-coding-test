package fastcampus.codingtest.day04;

import java.io.*;
import java.util.StringTokenizer;

public class Example5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] Ti = new int[N];
        int[] Pi = new int[N];
        int[] dp = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            Ti[i] = Integer.parseInt(st.nextToken());
            Pi[i] = Integer.parseInt(st.nextToken());
        }

        int max = Pi[0];

        for(int i=0; i<N; i++){
            dp[i] = Math.max(Ti[i],Ti[i+1]);
        }


    }
}
