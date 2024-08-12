import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 결과를 담을 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 배열을 순회하며 나누어 떨어지는 요소를 리스트에 추가
        for (int number : arr) {
            if (number % divisor == 0) {
                list.add(number);
            }
        }

        // 리스트가 비어있으면 -1을 배열로 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        // 리스트를 정렬
        Collections.sort(list);

        // 리스트를 배열로 변환하여 반환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

