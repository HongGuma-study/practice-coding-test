package fastcampus.codingtest.day06;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int total = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int left = 0;
        int right = arr[N-1];
        int mid = 0;

        while(left <= right){
            mid = ( left + right )/2;
            int sum = 0;
            for(int i=0; i<N; i++){
                if(mid > arr[i]){
                    sum += arr[i];
                }else{
                    sum += mid;
                }
            }
            if(sum <= total){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        bw.write(String.valueOf(right));
        bw.flush();
        bw.close();
    }
}
