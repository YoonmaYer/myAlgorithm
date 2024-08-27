import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] ranks = new int[n];
        
        // 평균 점수와 인덱스를 저장하는 배열 생성
        int[][] avgWithIndex = new int[n][2];

        // 평균과 인덱스를 저장
        for (int i = 0; i < n; i++) {
            avgWithIndex[i][0] = (score[i][0] + score[i][1]);  // 평균을 미리 계산하지 않고 합만 저장
            avgWithIndex[i][1] = i;  // 인덱스를 저장
        }

        // 평균 합계를 기준으로 내림차순 정렬
        Arrays.sort(avgWithIndex, (a, b) -> b[0] - a[0]);

        // 등수 계산
        int rank = 1;
        for (int i = 0; i < n; i++) {
            // 첫 번째 학생은 무조건 1등
            if (i > 0 && avgWithIndex[i][0] == avgWithIndex[i - 1][0]) {
                // 이전 학생과 같은 점수라면 같은 등수 부여
                ranks[avgWithIndex[i][1]] = ranks[avgWithIndex[i - 1][1]];
            } else {
                // 새로운 점수면 현재 인덱스+1 등수 부여
                ranks[avgWithIndex[i][1]] = i + 1;
            }
        }

        return ranks;
    }
}
