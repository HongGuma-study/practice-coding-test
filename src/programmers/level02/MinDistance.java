package programmers.level02;

import java.util.*;

//게임내 최단 거리
public class MinDistance {
    public static void main(String[] args) {
        int result = solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
        System.out.println("result = "+result);
        result = solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}});
        System.out.println("result = "+result);
        result = solution(new int[][]{{1,0,1,1,1,1},{1,0,1,0,1,1},{1,0,1,1,1,1},{1,1,1,0,0,1},{0,0,0,0,1,1}});
        System.out.println("result = "+result);
//        result = solution(new int[][]{{1,0,0,0,0,1,0,0},{1,0,0,0,0,1,0,0},{1,1,1,0,0,1,0,0},{0,0,1,1,0,1,1,1},{0,0,0,1,1,1,0,1},{0,0,0,0,1,1,0,1},{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,1}});
//        System.out.println("result = "+result);

    }

    static boolean[][] visit;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int[][] map;
    static int[][] dist;
    static int N; //가로
    static int M; //세로
    public static int solution(int[][] maps){
        N = maps.length;
        M = maps[0].length;
        map = maps;
        visit = new boolean[N][M];
        dist = new int[N][M];

        funcBFS(0,0);

        return dist[N-1][M-1];

    }

    public static void funcBFS(int x, int y){
        //dist 배열 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                dist[i][j] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        dist[x][y] = 1;
        visit[x][y] = true;

        while (!queue.isEmpty()){
            System.out.println();
            printMap();
            int[] node = queue.poll();
            x = node[0];
            y = node[1];

            for(int k=0; k<4; k++){
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(map[nx][ny] == 0) continue;
                if(visit[nx][ny]) continue;
                queue.add(new int[]{nx,ny});
                visit[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
    }

    /*public static void funcDFS(int x, int y){
        //상대 진영에 방문 했으면 리턴
        if(visit[N-1][M-1]) return;
        step++;
        visit[x][y] = true;

        System.out.println("step = "+step);
        printMap();

        for(int i=0; i<4; i++){
            int nx = x + dir[i][0]; //1 0 -1  0
            int ny = y + dir[i][1]; //0 1  0 -1
            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            //이 위치가 벽이면 패스
            if(map[nx][ny] == 0) continue;
            //방문 했으면 패스
            if(visit[nx][ny]) continue;
            //상대 진영에 방문 했으면 패스
            if(visit[N-1][M-1]) continue;
            funcDFS(nx,ny);
        }
    }*/

    public static void printMap(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]){
                    System.out.print("■ ");
                }else{
                    System.out.print(map[i][j]+" ");
                }
            }
            System.out.print("\t");
            for(int k=0; k<M; k++){
                System.out.printf("%2d\t", dist[i][k]);
            }
            System.out.println();
        }
    }
}
