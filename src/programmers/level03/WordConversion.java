package programmers.level03;

import java.util.*;

//단어 변환
public class WordConversion {
    public static void main(String[] args) {
        solution("hit","cog",new String[]{"hot", "dot", "dog", "lot", "log", "cog"}); //4
        wordList.clear();
        wordGraph.clear();
        solution("hit","cog",new String[]{"hot", "dot", "dog", "lot", "log"}); //0
        wordList.clear();
        wordGraph.clear();
        solution("hit","hot",new String[]{"hot", "dot", "dog", "lot", "log"}); //1
        wordList.clear();
        wordGraph.clear();
        solution("1234567000","1234567899",new String[]{ "1234567800", "1234567890", "1234567899"}); //3
        wordList.clear();
        wordGraph.clear();
        solution("hit", "cog", new String[]{"cog", "log", "lot", "dog", "hot"}); //4

    }

    static ArrayList<String> wordList = new ArrayList<>();
    static HashMap<String,ArrayList<String>> wordGraph = new HashMap<>();

    public static int solution(String begin, String target, String[] words) {
        int answer;

        //begin도 포함된 word 리스트 생성
        wordList.add(begin);
        wordList.addAll(Arrays.asList(words));
        if(!wordList.contains(target)) return 0; //wordList에 target없으면 바로 0

        Collections.sort(wordList);
        //그래프 노드 생성
        for(String word : wordList){
            wordGraph.put(word,new ArrayList<>());
        }

        //그래프 노드 연결
        for(String word : wordList){
            ArrayList<String> edge = new ArrayList<>();
            for(String w : words){
                if(equalsWord(word,w) != null)
                    edge.add(w);
            }
            Collections.sort(edge);
            wordGraph.put(word,edge);
        }

        System.out.println(wordGraph);
        answer = bfs(begin,target);

        System.out.println(answer);

        return answer;
    }

    static int bfs(String begin, String target){
        Queue<String> visited = new LinkedList<>();
        Queue<Node> needVisit = new LinkedList<>();

        Node fisrtNode = new Node();
        fisrtNode.word = begin;
        fisrtNode.step = 0;
        needVisit.add(fisrtNode);

        while(!needVisit.isEmpty()){
            Node node = needVisit.poll();
            if(node.word.equals(target)){
                return node.step;
            }
            if(!visited.contains(node.word)){
                visited.add(node.word);
                for(String edge : wordGraph.get(node.word)){
                    if(!visited.contains(edge)){
                        Node newNode = new Node();
                        newNode.word = edge;
                        newNode.step = node.step + 1;
                        needVisit.add(newNode);
                    }
                }
            }
        }

        return 0;
    }

    static class Node{
        String word;
        int step;
    }

    //단어가 한글자만 다른지 확인
    static String equalsWord(String key, String word){
        int cnt = 0;
        for(int i=0; i<key.length(); i++){
            if(key.charAt(i) != word.charAt(i)) cnt++;
        }
        if(cnt == 1) return word;
        return null;
    }


}
