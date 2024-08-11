import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 [-1] 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        // 배열에서 최소값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 결과를 저장할 새로운 배열 생성
        int[] answer = new int[arr.length - 1];
        int index = 0;
        
        // 최소값을 제외한 나머지 요소 복사
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}