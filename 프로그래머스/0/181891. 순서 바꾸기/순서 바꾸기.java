class Solution {
    public int[] solution(int[] num_list, int n) {
        // 두 개의 배열을 나눈 후 합치기
        int[] answer = new int[num_list.length];
        
        // 두 번째 부분 (n번째 인덱스부터 끝까지의 요소들을 앞에 붙이기)
        int idx = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        // 첫 번째 부분 (0부터 n-1번째 인덱스까지의 요소들을 뒤에 붙이기)
        for (int i = 0; i < n; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}