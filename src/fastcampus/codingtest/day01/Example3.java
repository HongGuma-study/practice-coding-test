package fastcampus.codingtest.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++){
            int num = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(arr);

            System.out.println(arr.get(0)+" "+arr.get(arr.size()-1));
        }

    }
}
