package programmers.level01;

// 카드 뭉치
public class CardBundle {
    public static void main(String[] args) {
        String answer1 = solution(new String[]{"i", "drink", "water"},new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        String answer2 = solution(new String[]{"i", "water", "drink"},new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int idx1 = 0;
        int idx2 = 0;

        for(String goalWord : goal){
            if(idx1 < cards1.length && goalWord.equals(cards1[idx1])){
                idx1++;
            }else if(idx2 < cards2.length && goalWord.equals(cards2[idx2])){
                idx2++;
            }else{
                return "No";
            }
        }

        return "Yes";
    }
}
