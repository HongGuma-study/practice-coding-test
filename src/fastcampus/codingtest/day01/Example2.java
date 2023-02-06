package fastcampus.codingtest.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if(M<60 && M>=45)
            System.out.println(H+" "+(M-45));
        else if(M<45) {
            if(H==0)
                System.out.println(23+" "+((M+60)-45));
            else
                System.out.println(H-1+" "+((M+60)-45));
        }

    }
}
