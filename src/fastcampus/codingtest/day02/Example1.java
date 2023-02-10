package fastcampus.codingtest.day02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> coins = new ArrayList<>();

        int answer = 0;

        for(int i=0; i<n; i++){
            coins.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(coins,Collections.reverseOrder());

        for(int coin : coins){
            if(coin <= k){
                answer += (k/coin);
                k -= coin * (k/coin);
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
