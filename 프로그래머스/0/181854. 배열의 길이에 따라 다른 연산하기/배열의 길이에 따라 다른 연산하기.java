class Solution {
    public int[] solution(int[] arr, int n) {
        // 원본 배열을 복사하여 answer 배열로 사용
        int[] answer = arr.clone(); 
        
        // 배열의 길이가 홀수인지 짝수인지 체크
        if (arr.length % 2 == 1) { // 홀수일 때
            for (int i = 0; i < arr.length; i += 2) {
                answer[i] += n; // 짝수 인덱스에 n 더함 (i = 0, 2, 4, ...)
            }
        } else { // 짝수일 때
            for (int i = 1; i < arr.length; i += 2) {
                answer[i] += n; // 홀수 인덱스에 n 더함 (i = 1, 3, 5, ...)
            }
        }
        
        return answer; // 결과 반환
    }
}
