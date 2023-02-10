package fastcampus.codingtest.day01;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            bw.write(solution(br.readLine())+"\n");
            bw.flush();
        }

        bw.close();
    }

    public static int solution(String inputString){
        int s = 0;
        int e = inputString.length()-1;

        while(s < e){
            if(inputString.charAt(s) == inputString.charAt(e)){
                s++;
                e--;
            }else{
                if(s < e-1){
//                    if(inputString.charAt(s) == inputString.charAt(e-1))
                }
                if(s + 1 < e){

                }
            }
        }

        return 0;
    }
}
