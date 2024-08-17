import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // num_list를 오름차순으로 정렬
        Arrays.sort(num_list);
        
        // 가장 작은 5개의 숫자를 제외한 나머지 숫자를 담은 배열 생성
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        return answer;
    }
}