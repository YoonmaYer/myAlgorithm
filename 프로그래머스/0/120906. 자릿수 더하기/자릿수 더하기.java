class Solution {
    public int solution(int n) {
        String answer = Integer.toString(n);
        String numString[] = answer.split(""); 
        
        int result = 0;
        
        for (int i=0; i < numString.length; i++) {
            result += Integer.parseInt(numString[i]);
        }
        return result;
    }
}