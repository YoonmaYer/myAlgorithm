public class Solution {
    public int solution(int[] array, int n) {
        int closest = array[0]; // 가장 가까운 수를 저장할 변수, 초기값은 배열의 첫 번째 원소로 설정

        // 배열을 순회하면서 가장 가까운 수를 찾음
        for (int i = 1; i < array.length; i++) {
            // 현재 수와 n 사이의 거리가 기존에 찾은 closest와 n 사이의 거리보다 작으면 closest를 현재 수로 업데이트
            if (Math.abs(array[i] - n) < Math.abs(closest - n)) {
                closest = array[i];
            }
            // 거리가 같을 경우 더 작은 수를 선택
            else if (Math.abs(array[i] - n) == Math.abs(closest - n) && array[i] < closest) {
                closest = array[i];
            }
        }

        return closest; // 가장 가까운 수 반환
    }
}
