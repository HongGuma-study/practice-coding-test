package programmers.level00;

class CreateAStrAttachingPartialStr{
    public static void main(String[] args) {
        solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0,4},{1,2},{3,5},{7,7}});
    }

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        int idx = 0;

        for(int i = 0 ; i < parts.length ; i++){
            int[] range = new int[2];
            for(int j = 0 ; j < parts[i].length ; j++){
                range[j] = parts[i][j];
            }
            answer += my_strings[idx++].substring(range[0],range[1]+1);
        }

        System.out.println(answer);

        return answer;
    }
}