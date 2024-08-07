import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
    
        List<String> unfinishedTasks = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinishedTasks.add(todo_list[i]);
            }
        }

        return unfinishedTasks.toArray(new String[0]);
    }
}
