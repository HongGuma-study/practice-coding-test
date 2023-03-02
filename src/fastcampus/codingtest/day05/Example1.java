package fastcampus.codingtest.day05;

import java.io.*;
import java.util.StringTokenizer;

//팰린드롬
public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[][] dp = new int[N][N];
        int S, E, end;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) { // 간격
            for (int start = 0; start < N - i; start++) {
                end = start + i;
                if (start == end) { // 간격이 0일때
                    dp[start][end] = 1;
                } else {
                    if (nums[start] == nums[end]) {
                        if ((start + 1) == end) {  // 간격이 1일때
                            dp[start][end] = 1;
                        } else {
                            if (dp[start + 1][end - 1] == 1) {
                                dp[start][end] = 1;
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            sb.append(dp[S - 1][E - 1] + "\n");
        }
        System.out.println(sb);
    }
}

