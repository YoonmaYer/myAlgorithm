import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> tempList = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                tempList.add(numlist[i]);
            }
        }
        
        // List를 배열로 변환
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}
