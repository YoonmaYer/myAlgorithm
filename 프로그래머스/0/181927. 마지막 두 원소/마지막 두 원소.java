import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int answer = 0;
        List<Integer> num_arrayList = new ArrayList<>();
        
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer = num_list[num_list.length - 1] * 2;
        }
        
        // 입력 배열의 요소들을 num_arrayList에 추가
        for (int num : num_list) {
            num_arrayList.add(num);
        }
        
        // answer를 추가
        num_arrayList.add(answer);
        
        // 리스트를 배열로 변환하여 반환
        return num_arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
