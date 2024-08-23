import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n); // 시작 값을 먼저 추가

        while(n != 1) {
            if (n % 2 == 0) { // 짝수인 경우
                n /= 2;
            } else { // 홀수인 경우
                n = 3 * n + 1;
            }
            answer.add(n); // 변화된 값을 리스트에 추가
        }

        // ArrayList를 정수 배열로 변환하여 반환
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        
        return result;
    }
}
