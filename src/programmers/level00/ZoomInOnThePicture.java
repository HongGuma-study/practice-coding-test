package programmers.level00;

import java.util.Arrays;

import programmers.level00.ClothingStoreDiscount.Solution;

public class ZoomInOnThePicture {
    public static void main(String[] args) {
        solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2);
        solution(new String[]{"x.x", ".x.", "x.x"}, 3);

    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        Arrays.fill(answer,"");

        int idx = 0;

        for(String line : picture){
            for(int i = 0 ; i < line.length() ; i++){
                for(int j = 0 ; j < k ; j++) answer[idx] += line.charAt(i);
            }

            for(int j = 1 ; j < k ; j++) answer[++idx] = answer[idx - 1];
            idx++;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
