import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 1. 신청 금액을 오름차순으로 정렬
        Arrays.sort(d);
        
        // 2. 작은 금액부터 예산에서 차감하면서 몇 개 부서를 지원할 수 있는지 계산
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else {
                break; // 예산이 부족하면 종료
            }
        }
        
        return answer;
    }
}