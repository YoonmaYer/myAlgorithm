import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        
        // 5명씩 건너뛰면서 첫 번째 사람을 리스트에 추가
        for (int i = 0; i < names.length; i += 5) {
            result.add(names[i]);
        }
        
        // 리스트를 배열로 변환하여 반환
        return result.toArray(new String[result.size()]);
    }
}
