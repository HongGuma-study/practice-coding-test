package programmers.level03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//아이템 줍기
public class PickingUpItems {
    public static void main(String[] args) {
        solution(new int[][]{{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}},1,3,7,8); //17
        solution(new int[][]{{1,1,8,4},{2,2,4,9},{3,6,9,8},{6,3,7,7}},9,7,6,1); //11
        solution(new int[][]{{1,1,5,7}},1,1,4,7); //9
        solution(new int[][]{{2,1,7,5},{6,4,10,10}},3,1,7,10); //15
        solution(new int[][]{{2,2,5,5},{1,3,6,4},{3,1,4,6}},1,4,6,3); //10
    }

    static int[][] map = {};
    static boolean[][] visited = {};
    static int[][] dist = {};
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int N;
    static int M;

    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY){
        int answer = 0;
        map = paintMap(rectangle);
        N = map.length;
        M = map[0].length;
        dist = new int[N][M];
        visited = new boolean[N][M];

        //9,7 -> 18,14
        bfs(characterY*2, characterX*2);
        //6,1 -> 12,2 -> 11,1
        answer = dist[itemY*2][itemX*2];
//        printMap();
        System.out.println(answer/2);
        return answer/2;
    }

    public static void bfs(int x, int y){
        //dir -1로 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                dist[i][j] = -1;
            }
        }

        Queue<int[]> needVisit = new LinkedList<>();
        needVisit.add(new int[]{x,y});
        dist[x][y] = 1;
        visited[x][y] = true;

        while (!needVisit.isEmpty()){
            int[] node = needVisit.poll();
            x = node[0];
            y = node[1];

//            printMap();

            for(int i=0; i<4; i++){
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny] == 0) continue;
                needVisit.add(new int[]{nx,ny});
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
    }

    //맵 그리기
    public static int[][] paintMap(int[][] rectangle){
        int maxX=0, maxY=0;

        for (int[] line : rectangle){
            maxX = Math.max(maxX, Math.max(line[0], line[2]));
            maxY = Math.max(maxY, Math.max(line[1], line[3]));
        }

//        System.out.println(maxX+", "+maxY);
        int[][] map = new int[maxY*2+2][maxX*2+2];

        //사각형 그리기
        for(int[] line : rectangle){
            for(int x = line[0]*2 ; x <= line[2]*2; x++){
                for(int y = line[1]*2 ; y <= line[3]*2; y++){
                    map[y][x] = 1;
                }
            }
        }
        //사각형 속 비우기
        for(int [] line : rectangle){
            for(int x = line[0]*2 + 1; x <= line[2]*2 - 1; x++){
                for(int y = line[1]*2 + 1; y <= line[3]*2 - 1; y++){
                    map[y][x] = 0;
                }
            }
        }


//        for (int[] ints : map) {
//            for (int y = 0; y < ints.length; y++) {
//                if (ints[y] == 1) {
//                    System.out.print(" ■ ");
//                } else {
//                    System.out.print(" □ ");
//                }
//            }
//            System.out.println();
//        }

        return map;

    }

    //맵 출력하기 (디버깅용)
    public static void printMap(){
        for (int x=0; x<map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                if (visited[x][y]) {
                    System.out.print(" ■ ");
                } else {
                    System.out.print(" □ ");
                }
            }
            System.out.printf("\t");
            for(int y=0; y< map[x].length; y++){
                System.out.printf(" %2d ", dist[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
