package fastcampus.codingtest.day02;

import java.io.*;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] students = new int[n];
        long answer = 0;

        for(int i=0; i<n; i++){
            students[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(students);

        int grade = 1;
        for(int student : students){
            answer += (Math.abs(student - grade));
            grade++;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
