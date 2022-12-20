package programmers.level03;

import java.util.*;

//네트워크
public class Network {
    public static void main(String[] args) {
        solution(3,new int[][]{{1,1,0},{1,1,0},{0,0,1}});
        solution(3,new int[][]{{1,1,0},{1,1,1},{0,1,1}});
        solution(9,new int[][]{
                {1,1,1,1,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0},
                {1,0,1,0,0,0,0,0,0},
                {1,0,0,1,1,1,0,0,0},
                {0,0,0,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,0,0},
                {0,0,0,0,0,0,1,1,0},
                {0,0,0,0,0,0,1,1,0},
                {0,0,0,0,0,0,0,0,1}});
    }

    static HashMap<Integer,ArrayList<Integer>> networkGraph = new HashMap<>();
    static ArrayList<Queue<Integer>> visited = new ArrayList<>();

    public static int solution(int n, int[][] computers){
        for (int i = 0; i < computers.length; i++) {
            ArrayList<Integer> conn = new ArrayList<>();
            for (int j = 0; j < computers[i].length; j++) {
                if(computers[i][j] == 1){
                    conn.add(j+1);
                }
            }
            networkGraph.put(i+1,conn);
        }

        System.out.println(networkGraph);
        for (int i = 1; i <= networkGraph.size(); i++) {
            int cnt = 0;
            for(Queue v : visited){
                if(v.contains(i)) cnt++;
            }
            if(cnt == 0){
                visited.add(dfs(i));
            }
        }

        System.out.println(visited);

        return visited.size();
    }

    public static Queue<Integer> dfs(int x){
        Queue<Integer> visit = new LinkedList<>();
        Stack<Integer> needVisited = new Stack<>();

        needVisited.add(x);

        while (!needVisited.isEmpty()){
            int node = needVisited.pop();
            if(!visit.contains(node)){
                visit.add(node);
                needVisited.addAll(networkGraph.get(node));
            }
        }

        return visit;

    }
}
