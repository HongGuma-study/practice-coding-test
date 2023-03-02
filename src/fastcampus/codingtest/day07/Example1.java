package fastcampus.codingtest.day07;

import java.io.*;
import java.util.*;

public class Example1 {

    private final static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int repeat = Integer.parseInt(st.nextToken());
        final int startNode = Integer.parseInt(st.nextToken());

        for(int i=0; i<repeat; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(graph.containsKey(n)){
                ArrayList<Integer> nodes = graph.get(n);
                nodes.add(m);
                graph.put(n,nodes);
            }else{
                ArrayList<Integer> nodes = new ArrayList<>();
                nodes.add(m);
                graph.put(n,nodes);
            }
        }

        System.out.println(graph);
        System.out.println(bfs(startNode));
        System.out.println(dfs(startNode));
    }

    public static ArrayList<Integer> bfs(int start){
        ArrayList<Integer> visited = new ArrayList<>();
        Queue<Integer> needVisite = new LinkedList<>();
        needVisite.add(start);

        while(!needVisite.isEmpty()){
            int node = needVisite.poll();
            if(!visited.contains(node)){
                visited.add(node);
                if(!graph.get(node).isEmpty()) needVisite.addAll(graph.get(node));
            }
        }

        return visited;
    }

    public static ArrayList<Integer> dfs(int start){
        ArrayList<Integer> visited = new ArrayList<>();
        Stack<Integer> needVisite = new Stack<>();
        needVisite.add(start);

        while(!needVisite.isEmpty()){
            int node = needVisite.pop();
            if(!visited.contains(node)){
                visited.add(node);
                if(!graph.get(node).isEmpty()) needVisite.addAll(graph.get(node));
            }
        }

        return visited;
    }
}
