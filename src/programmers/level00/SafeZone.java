package programmers.level00;

//안전지대
public class SafeZone {
    public static void main(String[] args) {
        solution(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}});
        solution(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}});
        solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}});
    }

    static int[][] dir = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
    static boolean[][] visited;
    static int[][] boards;
    static int N;
    static int M;

    public static int solution(int[][] board){
        N = board.length; //가로
        M = board[0].length; //세로
        boards = board;
        visited = new boolean[N][M];

        int answer = N * M;
    
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                if(board[i][j] == 1){
                    answer -= 1; //지뢰 본인 제외
                    answer -= search(i, j); //지뢰 주변 제외
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static int search(int x, int y){
        int count = 0;

        for(int k = 0 ; k < 8 ; k++){
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(visited[nx][ny]) continue;
            if(boards[nx][ny] == 1)continue;
            count++;
            visited[nx][ny] = true;
        }
       
        return count;
    }
}
