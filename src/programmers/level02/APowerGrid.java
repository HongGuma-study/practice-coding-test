package programmers.level02;

import java.util.*;

//전력망 둘로 나누기
public class APowerGrid {
    public static void main(String[] args) {
        solution(9,new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}});
        powerGrid.clear();
        solution(4,new int[][]{{1,2},{2,3},{3,4}});
        powerGrid.clear();
        solution(7,new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}});
    }

    static HashMap<Integer, ArrayList<Integer>> powerGrid = new HashMap<>();
    
    public static int solution(int n, int[][] wires){
        int answer = -1;
        ArrayList<Integer> answers = new ArrayList<>();

        for(int i=0; i<wires.length; i++){

            //그래프 만들기
            for (int j = 1; j <= n; j++) {
                powerGrid.put(j,new ArrayList<>());
            }

            int num = 0;
            for (int[] w : wires ) {
                if(num == i){
                    num++;
                    continue;
                }
                ArrayList<Integer> arr = powerGrid.get(w[0]);
                arr.add(w[1]);
                powerGrid.put(w[0],arr);
                arr = powerGrid.get(w[1]);
                arr.add(w[0]);
                powerGrid.put(w[1],arr);
                num++;
            }

            System.out.println("powerGrid : "+powerGrid);
            int num1 = dfs(wires[i][0]);
            int num2 = dfs(wires[i][1]);

            answers.add(Math.abs(num1-num2));

            powerGrid.clear();
        }

        System.out.println("answers: "+answers);

        Collections.sort(answers);
        System.out.println(answers.get(0));
        return answer;
    }

    public static int dfs(int start){
        Queue<Integer> visited = new LinkedList<>();
        Stack<Integer> needVisit = new Stack<>();

        needVisit.add(start);

        while (!needVisit.isEmpty()){
            int node = needVisit.pop();
            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(powerGrid.get(node));
            }
        }

        System.out.println(visited);
        return visited.size();
    }
}
