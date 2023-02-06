package fastcampus.codingtest.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b,s,sum=0,count=0;

        int n = Integer.parseInt(br.readLine());

        a = n/10;
        b = n%10;

        while(true) {
            sum = a+b;
            count++;
            s = (b*10)+(sum%10);
            if(n == s) {
                break;
            }
            else {
                a = s/10;
                b = s%10;
            }

        }

        System.out.println(count);
    }
}
