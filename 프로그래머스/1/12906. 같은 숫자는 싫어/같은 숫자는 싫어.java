import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 중복을 제거한 값을 저장할 리스트
        List<Integer> result = new ArrayList<>();
        
        // 배열의 첫 번째 원소는 무조건 결과에 추가
        result.add(arr[0]);

        // 배열을 순회하면서 연속된 중복 제거
        for (int i = 1; i < arr.length; i++) {
            // 이전 값과 다른 경우에만 추가
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
