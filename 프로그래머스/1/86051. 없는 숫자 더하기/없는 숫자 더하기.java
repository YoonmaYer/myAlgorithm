class Solution {
    public int solution(int[] numbers) {
        int max = 45;
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        
        return max-count;
    }
}