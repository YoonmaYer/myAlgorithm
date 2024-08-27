import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들의 패턴
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 맞춘 문제 수를 저장할 배열
        int[] score = {0, 0, 0};
        
        // 정답 배열과 수포자들의 패턴을 비교하여 맞춘 개수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                score[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                score[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                score[2]++;
            }
        }
        
        // 가장 많이 맞춘 점수 구하기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 가장 많이 맞춘 사람을 리스트에 추가
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                result.add(i + 1); // 1번 수포자는 인덱스 0에 저장되므로 i+1
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
