package fastcampus.codingtest.day02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Example2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int total = 0;
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        for(int i : arr){
            sum += i;
            total += sum;
        }

        bw.write(String.valueOf(total));
        bw.close();
    }
}
