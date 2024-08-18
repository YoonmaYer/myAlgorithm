import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 스택 역할을 할 리스트 선언
        ArrayList<Integer> stk = new ArrayList<>();
        
        // i를 0으로 초기화하고 반복문을 돌면서 arr 배열을 순회
        int i = 0;
        while (i < arr.length) {
            // 1. stk가 비어 있으면 현재 arr[i]를 추가
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;  // i를 증가
            }
            // 2. stk에 원소가 있고, 마지막 원소가 arr[i]보다 작으면 arr[i]를 추가
            else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;  // i를 증가
            }
            // 3. stk에 원소가 있고, 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 제거
            else {
                stk.remove(stk.size() - 1);
            }
        }

        // 결과를 int 배열로 변환하여 반환
        int[] result = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            result[j] = stk.get(j);
        }

        return result;
    }
}
