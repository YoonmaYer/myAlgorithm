class Solution {
    public int solution(String my_string) {
        String numStr = my_string.replaceAll("[^0-9]", "");
        char[] numChars = numStr.toCharArray();
        
        int[] answer = new int[numChars.length];
        for(int i = 0; i < numChars.length; i++) {
            answer[i] = Character.getNumericValue(numChars[i]);
        }
        
        int result = 0;
        for (int i = 0; i < answer.length; i++) {
            result += answer[i];
        }
        
        return result;
    }
}
