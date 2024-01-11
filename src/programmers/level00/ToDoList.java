package programmers.level00;

public class ToDoList {
    public static void main(String[] args) {
        
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int cnt = 0;
        for(boolean TF : finished){
            if(!TF) cnt++;
        }
        
        answer = new String[cnt];
        int idx = 0;
        for(int i = 0 ; i < todo_list.length; i++){
            if(!finished[i]){
                answer[idx++] = todo_list[i];                
            }
        }
        return answer;
    }
}
