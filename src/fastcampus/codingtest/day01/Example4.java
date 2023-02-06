package fastcampus.codingtest.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Example4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splitStr = br.readLine().split(" ");
        int n = Integer.parseInt(splitStr[0]);
        int k = Integer.parseInt(splitStr[1]);

        ArrayList<Integer> divisor = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n % i == 0) divisor.add(i);
        }

        Collections.sort(divisor);

        if(divisor.size() >= k)
            System.out.println(divisor.get(k-1));
        else
            System.out.println("0");
    }

}
