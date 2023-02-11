package fastcampus.codingtest.day03;

import java.io.*;
import java.util.StringTokenizer;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); //반 개수
        int[] students = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long answer = N; //반 개수 == 총 감독관 수

        for(int A : students){
            A -= B;
            if(A < 0) continue;
            if(A%C == 0){
                answer += A/C;
            }else{
                answer += A/C + 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();

    }
}
