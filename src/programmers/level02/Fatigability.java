package programmers.level02;

import java.util.ArrayList;
import java.util.Comparator;

//피로도
public class Fatigability {
    public static void main(String[] args) {
        solution(80,new int[][]{{80, 20},{50, 40},{30, 10}});
    }

    static boolean[] visited;
    static ArrayList<Integer> countList = new ArrayList<>();
    public static int solution(int k, int[][] dungeons) {

        int size = dungeons.length;
        visited = new boolean[size];

        perm(dungeons, k, visited,0, size,3, 0);

        countList.sort(Comparator.reverseOrder());
        System.out.println(countList);
        return countList.get(0);
    }

    //k == 피로도, n개중에 r개 뽑겠다.
    public static void perm(int[][] list, int k, boolean[] visited, int depth, int size, int r, int count){
        for(int i=0; i<size; i++){
            if(!visited[i] && k >= list[i][0]){
                visited[i] = true;
                perm(list,k-list[i][1], visited,depth+1, size, i,count+1);
                visited[i] = false;
            }
        }
        countList.add(count);
    }

  /*  public static void perm(int[][] list, int depth, int n, int k, int f){
//        int fatigability = f;
        if(depth == k){
            for(int[] d : list){
                System.out.println("---");
                System.out.print(d[0]+", "+d[1]+" | ");
            }
            return;
        }
//        if(list[depth][0] > f){
//            System.out.println("***");
//            for(int[] d : list){
//                System.out.print(d[0]+", "+d[1]+" | ");
//            }
//            System.out.println("***");
//            return;
//        }else{
//            answer++;
//            fatigability = fatigability - list[depth][1];
//            System.out.println(fatigability);
//        }

        for(int i=depth; i<n; i++){
            swap(list,depth,i);
            perm(list,depth+1,n,k,f);
            swap(list,depth,i);
        }
    }

    public static void swap(int[][] list, int depth, int n){
        int[] tmp = list[depth];
        list[depth] = list[n];
        list[n] = tmp;
    }*/
}
