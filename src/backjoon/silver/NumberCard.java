package backjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberCard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
    
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        HashSet<Integer> inputArr = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();

        while(st.hasMoreTokens()){
            inputArr.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int input = Integer.parseInt(st.nextToken());
            if(inputArr.contains(input)) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }


        
    }
}
