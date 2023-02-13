package fastcampus.codingtest.day04;

import java.io.*;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int[] N = new int[input+1];

        N[0] = 1;
        N[1] = 2;

        for(int i=2; i<input; i++){
            N[i] = (N[i-2] + N[i-1]) % 15746;
        }

        bw.write(String.valueOf(N[input-1]));
        bw.close();
    }
}
