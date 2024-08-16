class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 배열에 따라 arr 배열의 값을 교환
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            // arr[i]와 arr[j] 값을 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // 수정된 arr 배열 반환
        return arr;
    }
}