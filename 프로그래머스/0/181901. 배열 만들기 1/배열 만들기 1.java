class Solution {
    public int[] solution(int n, int k) {
        // k의 배수는 최대 n/k개 존재함
        int size = n / k;
        int[] result = new int[size];
        
        // k의 배수를 배열에 저장
        for (int i = 1; i <= size; i++) {
            result[i - 1] = i * k;
        }
        
        return result;
    }
}