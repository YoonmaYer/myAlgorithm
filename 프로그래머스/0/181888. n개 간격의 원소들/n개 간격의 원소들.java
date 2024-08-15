import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
    
    
      int[] result = new int[answer.size()];
    
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
    
    return result;
}
}