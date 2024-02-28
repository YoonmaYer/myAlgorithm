class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String numString = String.valueOf(num);
            for (int i = 0; i < numString.length(); i++) {
                if (numString.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
