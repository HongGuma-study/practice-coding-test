package programmers.level00;

//평행
public class PARALLEL {
    public static void main(String[] args) {
        int n = solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        System.out.println(n);
        n = solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        System.out.println(n);
        n = solution(new int[][]{{1, 0}, {0, 1}, {1, 2}, {2, 1}});
        System.out.println(n);
        n = solution(new int[][]{{1, 5}, {2, 4}, {3, 9}, {4, 8}});
        System.out.println(n);
        n = solution(new int[][]{{1, 1}, {10, 8}, {7, 7}, {8, 6}});
        System.out.println(n);
        n = solution(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}});
        System.out.println(n);
        n = solution(new int[][]{{1, 4}, {2, 1}, {3, 2}, {4, 7}});
        System.out.println(n);
    }

    public static int solution(int[][] dots) {
        
        int x12 = Math.abs(dots[1][0] - dots[0][0]); // x1 - x2
        int x34 = Math.abs(dots[3][0] - dots[2][0]); // x3 - x4

        int x13 = Math.abs(dots[2][0] - dots[0][0]); // x1 - x3
        int x24 = Math.abs(dots[3][0] - dots[1][0]); // x2 - x4

        int x14 = Math.abs(dots[3][0] - dots[0][0]); // x1 - x4
        int x23 = Math.abs(dots[2][0] - dots[1][0]); // x2 - x3

        int y12 = Math.abs(dots[1][1] - dots[0][1]); // y1 - y2
        int y34 = Math.abs(dots[3][1] - dots[2][1]); // y3 - y4

        int y13 = Math.abs(dots[2][1] - dots[0][1]); // y1 - y3
        int y24 = Math.abs(dots[3][1] - dots[1][1]); // y2 - y4
        
        int y14 = Math.abs(dots[3][1] - dots[0][0]); // y1 - y4
        int y23 = Math.abs(dots[2][1] - dots[1][1]); // y2 - y3


        if(y12/x12+(y12%x12) == y34/x34+(y34%x34)) return 1;

        if(y13/x13+(y13%x13) == y24/x24+(y24%x24)) return 1;

        if(y14/x14+(y12%x14) == y23/x23+(y23%x23)) return 1;
        


        return 0;
    }
}
