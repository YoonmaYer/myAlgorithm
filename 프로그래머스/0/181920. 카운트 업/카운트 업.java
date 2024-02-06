class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기 계산
        int size = end_num - start_num + 1;
        
        // 배열의 크기에 맞게 초기화
        int[] answer = new int[size];
        
        for (int i=0; i < size; i++) {
            answer[i] = start_num + i;
        }
        
        
        return answer;
    }
}