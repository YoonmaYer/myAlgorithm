class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 배열 초기화

        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; // 기존 배열 대신 answer 배열에 값을 저장
        }

        return answer;
    }
}